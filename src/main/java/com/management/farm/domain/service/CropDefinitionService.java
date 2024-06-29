package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;

import java.util.List;

public interface CropDefinitionService {

    List<CropDefinition> getAll();
}
