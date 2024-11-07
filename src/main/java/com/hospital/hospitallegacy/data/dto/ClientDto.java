package com.hospital.hospitallegacy.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String agency;
    private String guid;
    private String firstName;
    private String lastName;
    private String status;
    private LocalDate dob;
    private LocalDateTime createdDateTime;
}