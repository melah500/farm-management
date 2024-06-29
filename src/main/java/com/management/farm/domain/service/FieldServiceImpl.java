package com.management.farm.domain.service;

import com.management.farm.infrastructure.adapter.repository.FieldRepository;
import com.management.farm.infrastructure.adapter.repository.entity.Field;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldServiceImpl implements FieldService {

    private final FieldRepository fieldRepository;

    public FieldServiceImpl(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    @Override
    public List<Field> getAll() {
        return fieldRepository.findAll();
    }
}
