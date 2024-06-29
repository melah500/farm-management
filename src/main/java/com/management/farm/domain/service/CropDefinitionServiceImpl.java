package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.CropDefinitionRepository;
import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropDefinitionServiceImpl implements CropDefinitionService {

    private final CropDefinitionRepository cropDefinitionRepository;

    public CropDefinitionServiceImpl(CropDefinitionRepository cropDefinitionRepository) {
        this.cropDefinitionRepository = cropDefinitionRepository;
    }

    @Override
    public List<CropDefinition> getAll() {
        return cropDefinitionRepository.findAll();
    }
}
