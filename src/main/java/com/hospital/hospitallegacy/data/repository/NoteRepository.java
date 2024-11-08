package com.hospital.hospitallegacy.data.repository;

import com.hospital.hospitallegacy.data.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByClient_GuidAndClient_AgencyAndDatetimeBetween(UUID clientGuid, String agency, LocalDateTime datetimeStart, LocalDateTime datetimeEnd);
}