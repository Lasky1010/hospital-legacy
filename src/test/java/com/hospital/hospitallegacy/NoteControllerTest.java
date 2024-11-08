package com.hospital.hospitallegacy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NoteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getNotesByClientGuidAndDatePeriod() throws Exception {
        String getNoteRequest = """
                {
                    "agency": "hhv4",
                    "dateFrom": "2024-11-08",
                    "dateTo": "2024-11-08",
                    "clientGuid": "25fdccf6-24d1-4de7-b686-dc2f396b6994"
                }""";

        mockMvc.perform(post("/notes")
                        .content(getNoteRequest)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
