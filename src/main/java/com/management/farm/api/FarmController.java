package com.management.farm.api;

import com.management.farm.domain.model.FarmDto;
import com.management.farm.domain.service.FarmService;
import com.management.farm.infrastructure.adapter.gateway.mapper.FarmMapper;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/farm")
@Slf4j
public class FarmController implements FarmControllerApi {

    private final FarmService farmService;
    private final FarmMapper farmMapper;

    public FarmController(FarmService farmService, FarmMapper farmMapper) {
        this.farmService = farmService;
        this.farmMapper = farmMapper;
    }

    @Override
    @GetMapping("/getAll")
    public List<FarmDto> getAll() {
        List<Farm> farms = farmService.getAll();
        List<FarmDto> mappedFarms = farms.stream().map(farm -> farmMapper.map(farm))
                .collect(Collectors.toUnmodifiableList());
        log.info("Farms : {}", mappedFarms);
        return mappedFarms;
    }


}
