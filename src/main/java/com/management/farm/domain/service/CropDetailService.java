package com.management.farm.domain.service;

import com.management.farm.domain.model.CropDetailsSearchDto;
import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;

import java.util.List;

public interface CropDetailService {

    List<CropDetail> findByCriteria(CropDetailsSearchDto cropDetailsSearchDto);

    CropDetail save(CropDetail cropDetail);
}
