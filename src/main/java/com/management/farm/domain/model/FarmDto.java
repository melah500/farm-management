package com.management.farm.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FarmDto {

    @JsonIgnore
    private Long id;
    private String name;
    private String identifier;

}
