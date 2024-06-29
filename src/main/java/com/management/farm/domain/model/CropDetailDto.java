package com.management.farm.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import com.management.farm.infrastructure.adapter.repository.entity.Field;
import com.management.farm.infrastructure.adapter.repository.entity.Season;
import lombok.Data;

@Data
public class CropDetailDto {

    @JsonIgnore
    private Long id;

    private String name;

    private Float plantingArea;

    private CropDefinition cropDefinition;

    private Float expectedOutput;

    private Float actualOutput;

    private Field field;

    private Farm farm;

    private Season season;
}
