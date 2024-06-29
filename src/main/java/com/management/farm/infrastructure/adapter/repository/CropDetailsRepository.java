package com.management.farm.infrastructure.adapter.repository;

import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropDetailsRepository extends JpaRepository<CropDetail, Long> {

    List<CropDetail> findAllByFarmIdentifierAndSeasonIdentifierAndCropDefinitionIdentifier(
            final String farmIdentifier,
            final String seasonIdentifier,
            final String cropDefinitionIdentifier
    );
}
