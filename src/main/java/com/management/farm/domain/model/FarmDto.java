package com.management.farm.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class FarmDto {

    @JsonIgnore
    private Long id;
    private String name;
    private String identifier;

}
