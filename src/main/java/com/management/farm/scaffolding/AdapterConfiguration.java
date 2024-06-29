package com.management.farm.scaffolding;

import com.management.farm.infrastructure.adapter.gateway.mapper.CropDefinitionMapper;
import com.management.farm.infrastructure.adapter.gateway.mapper.CropDetailMapper;
import com.management.farm.infrastructure.adapter.gateway.mapper.FarmMapper;
import com.management.farm.infrastructure.adapter.gateway.mapper.FieldMapper;
import com.management.farm.infrastructure.adapter.gateway.mapper.SeasonMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterConfiguration {

    @Bean
    public FarmMapper farmMapper() {
        return Mappers.getMapper(FarmMapper.class);
    }

    @Bean
    public FieldMapper fieldMapper() {
        return Mappers.getMapper(FieldMapper.class);
    }

    @Bean
    public SeasonMapper seasonMapper() {
        return Mappers.getMapper(SeasonMapper.class);
    }

    @Bean
    public CropDefinitionMapper cropDefinitionMapper() {
        return Mappers.getMapper(CropDefinitionMapper.class);
    }

    @Bean
    public CropDetailMapper cropDetailMapper() {
        return Mappers.getMapper(CropDetailMapper.class);
    }
}
