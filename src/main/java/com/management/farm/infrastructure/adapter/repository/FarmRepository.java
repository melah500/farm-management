package com.management.farm.infrastructure.adapter.repository;

import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm, Long> {
}
