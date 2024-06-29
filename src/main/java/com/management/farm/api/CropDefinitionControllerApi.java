package com.management.farm.api;

import com.management.farm.domain.model.CropDefinitionDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Crop Definition", description = "Crop Definition Management API")
public interface CropDefinitionControllerApi {

    @Operation(
            summary = "Fetches all crop definitions",
            description = "fetches all crop definition records and their data from data source")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "500", description = "internal server error")
    })
    List<CropDefinitionDto> getAll();
}
