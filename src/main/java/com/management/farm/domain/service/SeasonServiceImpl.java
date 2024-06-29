package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.SeasonRepository;
import com.management.farm.infrastructure.adapter.repository.entity.Season;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonServiceImpl implements SeasonService {

    private final SeasonRepository seasonRepository;

    public SeasonServiceImpl(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    @Override
    public List<Season> getAll() {
        return seasonRepository.findAll();
    }
}
