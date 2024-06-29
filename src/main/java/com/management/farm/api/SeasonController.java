package com.management.farm.api;

import com.management.farm.domain.model.SeasonDto;
import com.management.farm.domain.service.SeasonService;
import com.management.farm.infrastructure.adapter.gateway.mapper.SeasonMapper;
import com.management.farm.infrastructure.adapter.repository.entity.Season;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/season")
@Slf4j
public class SeasonController implements SeasonControllerApi {

    private final SeasonService seasonService;
    private final SeasonMapper seasonMapper;

    public SeasonController(SeasonService seasonService, SeasonMapper seasonMapper) {
        this.seasonService = seasonService;
        this.seasonMapper = seasonMapper;
    }


    @Override
    @GetMapping("/getAll")
    public List<SeasonDto> getAll() {
        List<Season> seasons = seasonService.getAll();
        List<SeasonDto> mappedSeasons = seasons.stream().map(season -> seasonMapper.map(season))
                .collect(Collectors.toUnmodifiableList());
        log.info("Seasons : {}", mappedSeasons);
        return mappedSeasons;
    }
}
