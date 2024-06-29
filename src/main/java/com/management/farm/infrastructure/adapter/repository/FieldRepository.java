package com.management.farm.infrastructure.adapter.repository;

import com.management.farm.infrastructure.adapter.repository.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FieldRepository extends JpaRepository<Field, Long> {
}
