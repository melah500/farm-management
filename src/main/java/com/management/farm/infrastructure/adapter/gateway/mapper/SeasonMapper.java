package com.management.farm.infrastructure.adapter.gateway.mapper;

import com.management.farm.domain.model.SeasonDto;
import com.management.farm.infrastructure.adapter.repository.entity.Season;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SeasonMapper {

    SeasonMapper INSTANCE = Mappers.getMapper(SeasonMapper.class);

    SeasonDto map(Season season);

    Season map(SeasonDto seasonDto);
}
