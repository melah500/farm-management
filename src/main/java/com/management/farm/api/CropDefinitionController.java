package com.management.farm.api;

import com.management.farm.domain.model.CropDefinitionDto;
import com.management.farm.domain.service.CropDefinitionService;
import com.management.farm.infrastructure.adapter.gateway.mapper.CropDefinitionMapper;
import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/cropDefinition")
@Slf4j
public class CropDefinitionController implements CropDefinitionControllerApi {

    private final CropDefinitionService cropDefinitionService;
    private final CropDefinitionMapper cropDefinitionMapper;

    public CropDefinitionController(CropDefinitionService cropDefinitionService,
                                    CropDefinitionMapper cropDefinitionMapper) {
        this.cropDefinitionService = cropDefinitionService;
        this.cropDefinitionMapper = cropDefinitionMapper;
    }


    @Override
    @GetMapping("/getAll")
    public List<CropDefinitionDto> getAll() {
        List<CropDefinition> cropDefinitions = cropDefinitionService.getAll();
        List<CropDefinitionDto> mappedCropDefinitions =
                cropDefinitions.stream().map(season -> cropDefinitionMapper.map(season))
                        .collect(Collectors.toUnmodifiableList());
        log.info("Crop Definitions : {}", mappedCropDefinitions);
        return mappedCropDefinitions;
    }
}
