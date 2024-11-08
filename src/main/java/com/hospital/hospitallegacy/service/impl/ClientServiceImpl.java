package com.hospital.hospitallegacy.service.impl;

import com.hospital.hospitallegacy.data.dto.ClientDto;
import com.hospital.hospitallegacy.data.mapper.ClientMapper;
import com.hospital.hospitallegacy.data.repository.ClientRepository;
import com.hospital.hospitallegacy.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientDto> getAllClients() {
        log.info("Get all clients");
        var allClients = clientRepository.findAll();
        return clientMapper.toDtoList(allClients);
    }
}
