package com.management.farm.infrastructure.adapter.repository;

import com.management.farm.infrastructure.adapter.repository.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
}
