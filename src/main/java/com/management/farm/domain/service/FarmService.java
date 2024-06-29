package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.entity.Farm;

import java.util.List;

public interface FarmService {

    List<Farm> getAll();
}
