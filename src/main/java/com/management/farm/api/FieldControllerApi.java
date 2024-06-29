package com.management.farm.api;

import com.management.farm.domain.model.FieldDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Field", description = "Field Management API")
public interface FieldControllerApi {

    @Operation(
            summary = "Fetches all fields",
            description = "fetches all field records and their data from data source")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "500", description = "internal server error")
    })
    List<FieldDto> getAll();
}
