package com.management.farm.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SeasonDto {

    @JsonIgnore
    private Long id;
    private String identifier;
    private String name;
    private LocalDateTime seasonStartDate;
    private LocalDateTime seasonEndDate;
}
