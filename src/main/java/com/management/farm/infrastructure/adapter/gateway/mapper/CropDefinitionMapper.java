package com.management.farm.infrastructure.adapter.gateway.mapper;

import com.management.farm.domain.model.CropDefinitionDto;
import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CropDefinitionMapper {

    CropDefinitionMapper INSTANCE = Mappers.getMapper(CropDefinitionMapper.class);

    CropDefinitionDto map(CropDefinition cropDefinition);

    CropDefinition map(CropDefinitionDto cropDefinitionDto);
}
