package com.management.farm.infrastructure.adapter.repository;

import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropDefinitionRepository extends JpaRepository<CropDefinition, Long> {
}
