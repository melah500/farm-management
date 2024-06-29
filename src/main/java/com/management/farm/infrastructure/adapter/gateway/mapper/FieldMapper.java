package com.management.farm.infrastructure.adapter.gateway.mapper;

import com.management.farm.domain.model.FieldDto;
import com.management.farm.infrastructure.adapter.repository.entity.Field;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FieldMapper {

    FieldMapper INSTANCE = Mappers.getMapper(FieldMapper.class);

    FieldDto map(Field field);

    Field map(FieldDto fieldDto);
}
