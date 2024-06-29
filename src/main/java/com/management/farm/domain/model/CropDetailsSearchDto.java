package com.management.farm.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CropDetailsSearchDto {

    private String seasonIdentifier;
    private String farmIdentifier;
    private String cropIdentifier;
}
