package com.hospital.hospitallegacy.controller;

import com.hospital.hospitallegacy.data.dto.NoteDto;
import com.hospital.hospitallegacy.data.request.GetNoteRequest;
import com.hospital.hospitallegacy.service.NoteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @PostMapping("/notes")
    public ResponseEntity<List<NoteDto>> getNotesByClientGuidAndDatePeriod(
            @Valid @RequestBody GetNoteRequest getNoteRequest) {
        var result = noteService.getClientNotesByDatePeriod(
                getNoteRequest.getAgency(), getNoteRequest.getClientGuid(),
                getNoteRequest.getDateFrom(), getNoteRequest.getDateTo());
        return ResponseEntity.ok(result);
    }

}
