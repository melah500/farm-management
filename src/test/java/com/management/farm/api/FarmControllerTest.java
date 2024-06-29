package com.management.farm.api;

import com.management.farm.domain.service.FarmService;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class FarmControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FarmService farmService;

    @Disabled
    @Test
    void getFarms_ReturnsOk() throws Exception {

        List<Farm> farms = List.of(Farm.builder()
                .id(1L)
                .name("Myfarm")
                .identifier("FA01")
                .build());

        //given
        given(farmService.getAll())
                .willReturn(farms);

        //when //then
        mockMvc.perform(get("/api/v1/farm/getAll"))
                .andExpect(status().isOk());
    }
}
