package com.management.farm.infrastructure.adapter.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "crop_details")
@Builder
public class CropDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "planting_area_in_acres")
    private Float plantingArea;

    @OneToOne
    private CropDefinition cropDefinition;

    @Column(name = "expected_output_in_tons")
    private Float expectedOutput;

    @Column(name = "actual_output_in_tons")
    private Float actualOutput;

    @OneToOne
    private Field field;

    @OneToOne
    private Farm farm;

    @OneToOne
    private Season season;
}
