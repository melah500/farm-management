package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.entity.Field;

import java.util.List;

public interface FieldService {

    List<Field> getAll();
}
