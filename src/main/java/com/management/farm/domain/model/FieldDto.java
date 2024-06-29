package com.management.farm.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import lombok.Data;

@Data
public class FieldDto {

    @JsonIgnore
    private Long id;
    private String identifier;
    private String name;
    @JsonIgnore
    private Farm farm;
}
