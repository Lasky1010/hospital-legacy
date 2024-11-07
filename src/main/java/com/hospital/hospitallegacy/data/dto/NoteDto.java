package com.hospital.hospitallegacy.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {
    String guid;
    String comments;
    LocalDateTime modifiedDateTime;
    LocalDateTime datetime;
    String loggedUser;
    LocalDateTime createdDateTime;
    String clientGuid;
}