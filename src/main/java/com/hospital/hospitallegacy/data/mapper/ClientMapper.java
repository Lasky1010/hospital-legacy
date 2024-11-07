package com.hospital.hospitallegacy.data.mapper;

import com.hospital.hospitallegacy.data.entity.Client;
import com.hospital.hospitallegacy.data.dto.ClientDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientMapper {

    Client toEntity(ClientDto clientDto);

    ClientDto toDto(Client client);

    List<Client> toEntityList(List<ClientDto> clientDtoList);

    List<ClientDto> toDtoList(List<Client> clientList);
}