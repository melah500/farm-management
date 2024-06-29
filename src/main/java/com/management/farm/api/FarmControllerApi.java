package com.management.farm.api;

import com.management.farm.domain.model.FarmDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Farm", description = "Farm Management API")
public interface FarmControllerApi {

    @Operation(
            summary = "Fetches all farms",
            description = "fetches all farms records and their data from data source")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "500", description = "internal server error")
    })
    List<FarmDto> getAll();
}
