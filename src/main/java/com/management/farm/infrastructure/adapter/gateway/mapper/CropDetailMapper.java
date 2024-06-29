package com.management.farm.infrastructure.adapter.gateway.mapper;

import com.management.farm.domain.model.CropDetailDto;
import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CropDetailMapper {

    CropDetailMapper INSTANCE = Mappers.getMapper(CropDetailMapper.class);

    CropDetailDto map(CropDetail cropDetail);

    CropDetail map(CropDetailDto cropDetailDto);
}
