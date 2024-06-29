package com.management.farm.domain.service;

import com.management.farm.domain.model.CropDetailsSearchDto;
import com.management.farm.infrastructure.adapter.repository.CropDetailsRepository;
import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropDetailServiceImpl implements CropDetailService {

    private final CropDetailsRepository cropDetailsRepository;

    public CropDetailServiceImpl(CropDetailsRepository cropDetailsRepository) {
        this.cropDetailsRepository = cropDetailsRepository;
    }

    @Override
    public List<CropDetail> findByCriteria(CropDetailsSearchDto cropDetailsSearchDto) {
        return cropDetailsRepository.findAllByFarmIdentifierAndSeasonIdentifierAndCropDefinitionIdentifier(
                cropDetailsSearchDto.getFarmIdentifier(),
                cropDetailsSearchDto.getSeasonIdentifier(),
                cropDetailsSearchDto.getCropIdentifier()
        );
    }

    @Override
    public CropDetail save(CropDetail cropDetail) {
        return cropDetailsRepository.save(cropDetail);
    }
}
