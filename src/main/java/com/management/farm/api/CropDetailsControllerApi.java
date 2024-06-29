package com.management.farm.api;

import com.management.farm.domain.model.CropDetailDto;
import com.management.farm.domain.model.CropDetailsSaveDto;
import com.management.farm.domain.model.CropDetailsSearchDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

@Tag(name = "Crop Details", description = "Crop Details Management API")
public interface CropDetailsControllerApi {

    @Operation(
            summary = "Fetches all crop details",
            description = "fetches all crop details records and their data from data source")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "500", description = "internal server error")
    })
    List<CropDetailDto> getAllByCriteria(final CropDetailsSearchDto cropDetailsSearchDto);

    @Operation(
            summary = "Save crop details",
            description = "Save crop detail records and their data to the data source")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "created"),
            @ApiResponse(responseCode = "500", description = "internal server error")
    })
    CropDetailDto saveCropDetails(final CropDetailsSaveDto cropDetailsSaveDto)
            throws ExecutionControl.NotImplementedException;
}
