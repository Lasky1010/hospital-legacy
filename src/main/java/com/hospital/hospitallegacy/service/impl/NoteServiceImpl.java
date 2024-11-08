package com.hospital.hospitallegacy.service.impl;

import com.hospital.hospitallegacy.data.dto.NoteDto;
import com.hospital.hospitallegacy.data.mapper.NoteMapper;
import com.hospital.hospitallegacy.data.repository.NoteRepository;
import com.hospital.hospitallegacy.service.NoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;

    @Override
    public List<NoteDto> getClientNotesByDatePeriod(String agency, String clientGuid, LocalDate dateFrom, LocalDate dateTo) {
        log.info("Client: {} - agency: {}", clientGuid, agency);
        log.info("Get client notes by DatePeriod {} - {}", dateFrom, dateTo);
        var localDateTimeFrom = dateFrom.atStartOfDay();
        var localDateTimeTo = dateTo.atStartOfDay();
        var notes = noteRepository.findByClient_GuidAndClient_AgencyAndDatetimeBetween(UUID.fromString(clientGuid), agency, localDateTimeFrom, localDateTimeTo);
        return noteMapper.toDtoList(notes);
    }
}
