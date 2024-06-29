package com.management.farm.api;

import com.management.farm.domain.model.CropDetailDto;
import com.management.farm.domain.model.CropDetailsSaveDto;
import com.management.farm.domain.model.CropDetailsSearchDto;
import com.management.farm.domain.service.CropDetailService;
import com.management.farm.infrastructure.adapter.gateway.mapper.CropDetailMapper;
import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;
import jdk.jshell.spi.ExecutionControl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/cropDetail")
@Slf4j
public class CropDetailsController implements CropDetailsControllerApi {

    private final CropDetailService cropDetailService;
    private final CropDetailMapper cropDetailMapper;

    public CropDetailsController(CropDetailService cropDetailService, CropDetailMapper cropDetailMapper) {
        this.cropDetailService = cropDetailService;
        this.cropDetailMapper = cropDetailMapper;
    }

    @Override
    @GetMapping("/getByCriteria")
    public List<CropDetailDto> getAllByCriteria(@RequestBody CropDetailsSearchDto cropDetailsSearchDto) {
        List<CropDetail> cropsDetails = cropDetailService.findByCriteria(cropDetailsSearchDto);
        List<CropDetailDto> mappedCropDetails =
                cropsDetails.stream().map(cropDetail -> cropDetailMapper.map(cropDetail))
                        .collect(Collectors.toUnmodifiableList());
        log.info("Crop Details : {}", mappedCropDetails);
        return mappedCropDetails;
    }

    @Override
    @PostMapping("/save")
    public CropDetailDto saveCropDetails(CropDetailsSaveDto cropDetailsSaveDto)
            throws ExecutionControl.NotImplementedException {
        //TODO: This method can be implemented to capture the crop details from the client (angular app), but for the purposes of this assignment and time constraints we will use data loader to capture these details
        throw new ExecutionControl.NotImplementedException("Not implemented yet!");
    }
}
