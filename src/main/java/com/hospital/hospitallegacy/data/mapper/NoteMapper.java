package com.hospital.hospitallegacy.data.mapper;

import com.hospital.hospitallegacy.data.dto.NoteDto;
import com.hospital.hospitallegacy.data.entity.Note;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NoteMapper {
    @Mapping(source = "clientGuid", target = "client.guid")
    Note toEntity(NoteDto noteDto);

    @Mapping(source = "client.guid", target = "clientGuid")
    NoteDto toDto(Note note);

    List<NoteDto> toDtoList(List<Note> notes);

    List<Note> toEntityList(List<NoteDto> noteDtos);
}