package com.hospital.hospitallegacy.data.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class GetNoteRequest {

    private String agency;

    @NotNull(message = "DateFrom can't be null!!!")
    private LocalDate dateFrom;

    @NotNull(message = "DateTo can't be null!!!")
    private LocalDate dateTo;

    private String clientGuid;
}
