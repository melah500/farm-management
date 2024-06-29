package com.management.farm.domain.model;

import lombok.Data;

@Data
public class CropDetailsSaveDto {

    private String cropName;
    private Float plantingArea;
    private Float expectedOutput;
    private Float actualOutput;
    private String fieldName;
    private String farmName;
    private String seasonName;
}
