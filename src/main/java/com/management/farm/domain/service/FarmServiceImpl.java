package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.FarmRepository;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl implements FarmService {

    private final FarmRepository farmRepository;

    public FarmServiceImpl(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    @Override
    public List<Farm> getAll() {
        return farmRepository.findAll();
    }
}
