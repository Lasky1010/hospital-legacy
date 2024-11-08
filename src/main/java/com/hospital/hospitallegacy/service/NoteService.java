package com.hospital.hospitallegacy.service;

import com.hospital.hospitallegacy.data.dto.NoteDto;

import java.time.LocalDate;
import java.util.List;

public interface NoteService {

    List<NoteDto> getClientNotesByDatePeriod(String agency, String clientGuid, LocalDate dateFrom, LocalDate dateTo);
}
