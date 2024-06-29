package com.management.farm.infrastructure.adapter.gateway.mapper;

import com.management.farm.domain.model.FarmDto;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FarmMapper {

    FarmMapper INSTANCE = Mappers.getMapper(FarmMapper.class);

    FarmDto map(Farm farm);

    Farm map(FarmDto farmDto);
}
