package com.hospital.hospitallegacy.data.dto;

import java.time.LocalDateTime;

public record NoteDto(
        String guid,
        String comments,
        LocalDateTime modifiedDateTime,
        LocalDateTime datetime,
        String loggedUser,
        LocalDateTime createdDateTime,
        String clientGuid) {
}