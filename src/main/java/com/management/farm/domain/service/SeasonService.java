package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.entity.Season;

import java.util.List;

public interface SeasonService {

    List<Season> getAll();
}
