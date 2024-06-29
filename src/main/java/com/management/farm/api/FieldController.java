package com.management.farm.api;

import com.management.farm.domain.model.FieldDto;
import com.management.farm.domain.service.FieldService;
import com.management.farm.infrastructure.adapter.gateway.mapper.FieldMapper;
import com.management.farm.infrastructure.adapter.repository.entity.Field;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/field")
@Slf4j
public class FieldController implements FieldControllerApi {

    private final FieldService fieldService;
    private final FieldMapper fieldMapper;

    public FieldController(FieldService fieldService, FieldMapper fieldMapper) {
        this.fieldService = fieldService;
        this.fieldMapper = fieldMapper;
    }


    @Override
    @GetMapping("/getAll")
    public List<FieldDto> getAll() {
        List<Field> fields = fieldService.getAll();
        List<FieldDto> mappedFields = fields.stream().map(field -> fieldMapper.map(field))
                .collect(Collectors.toUnmodifiableList());
        log.info("Fields : {}", mappedFields);
        return mappedFields;
    }
}
