package com.hospital.hospitallegacy.controller;

import com.hospital.hospitallegacy.data.dto.ClientDto;
import com.hospital.hospitallegacy.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping(path = "/clients")
    public ResponseEntity<List<ClientDto>> getAllClients() {
        var result = clientService.getAllClients();
        return ResponseEntity.ok(result);
    }

}
