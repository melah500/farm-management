package com.management.farm.infrastructure.adapter.repository.dataloader;

import com.management.farm.infrastructure.adapter.repository.CropDefinitionRepository;
import com.management.farm.infrastructure.adapter.repository.CropDetailsRepository;
import com.management.farm.infrastructure.adapter.repository.FarmRepository;
import com.management.farm.infrastructure.adapter.repository.FieldRepository;
import com.management.farm.infrastructure.adapter.repository.SeasonRepository;
import com.management.farm.infrastructure.adapter.repository.entity.CropDefinition;
import com.management.farm.infrastructure.adapter.repository.entity.CropDetail;
import com.management.farm.infrastructure.adapter.repository.entity.Farm;
import com.management.farm.infrastructure.adapter.repository.entity.Field;
import com.management.farm.infrastructure.adapter.repository.entity.Season;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final FarmRepository farmRepository;
    private final FieldRepository fieldRepository;
    private final SeasonRepository seasonRepository;
    private final CropDefinitionRepository cropDefinitionRepository;
    private final CropDetailsRepository cropDetailsRepository;

    public DataLoader(FarmRepository farmRepository, FieldRepository fieldRepository, SeasonRepository seasonRepository,
                      CropDefinitionRepository cropDefinitionRepository, CropDetailsRepository cropDetailsRepository) {
        this.farmRepository = farmRepository;
        this.fieldRepository = fieldRepository;
        this.seasonRepository = seasonRepository;
        this.cropDefinitionRepository = cropDefinitionRepository;
        this.cropDetailsRepository = cropDetailsRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        farmRepository.save(Farm.builder().id(1L).name("Farm A").identifier("FA01").build());
        farmRepository.save(Farm.builder().id(2L).name("Farm B").identifier("FB01").build());
        farmRepository.save(Farm.builder().id(3L).name("Farm C").identifier("FC01").build());

        fieldRepository.save(
                Field.builder().id(1L).name("Field A").farm(Farm.builder().id(1L).name("Farm A").build()).build());
        fieldRepository.save(
                Field.builder().id(2L).name("Field A").farm(Farm.builder().id(2L).name("Farm B").build()).build());

        seasonRepository.save(Season.builder().id(1L).name("Season A")
                .seasonStartDate(LocalDateTime.of(LocalDate.of(2024, 06, 15), LocalTime.of(0, 0)))
                .seasonEndDate(LocalDateTime.of(LocalDate.of(2025, 06, 15), LocalTime.of(0, 0)))
                .identifier("SI01").build());
        seasonRepository.save(Season.builder().id(2L).name("Season B")
                .seasonStartDate(LocalDateTime.of(LocalDate.of(2024, 06, 15), LocalTime.of(0, 0)))
                .seasonEndDate(LocalDateTime.of(LocalDate.of(2025, 06, 15), LocalTime.of(0, 0)))
                .identifier("SI02").build());

        cropDefinitionRepository.save(CropDefinition.builder().id(1L).name("Corn").identifier("CI01").build());
        cropDefinitionRepository.save(CropDefinition.builder().id(2L).name("Potato").identifier("PI01").build());

        cropDetailsRepository.save(CropDetail.builder().id(1L)
                .cropDefinition(
                        CropDefinition.builder().id(1L).name("Corn").identifier("CI01").build()
                )
                .plantingArea(234f)
                .expectedOutput(2000f)
                .actualOutput(4000f)
                .field(
                        Field.builder().id(1L).name("Field A").farm(Farm.builder().id(1L).name("Farm A").build())
                                .build()
                )
                .farm(
                        Farm.builder().id(1L).name("Farm A").identifier("FA01").build()
                )
                .season(
                        Season.builder().id(2L).name("Season B")
                                .seasonStartDate(LocalDateTime.of(LocalDate.of(2024, 06, 15), LocalTime.of(0, 0)))
                                .seasonEndDate(LocalDateTime.of(LocalDate.of(2025, 06, 15), LocalTime.of(0, 0)))
                                .identifier("SI02").build()
                )
                .build());
//
//        cropDetailsRepository.save(CropDetail.builder().id(2L)
//                .cropDefinition(
//                        CropDefinition.builder().id(1L).name("Potato").identifier("PI01").build()
//                )
//                .plantingArea(234f)
//                .expectedOutput(2000f)
//                .actualOutput(4000f)
//                .field(
//                        Field.builder().id(1L).name("Field B").farm(Farm.builder().id(1L).name("Farm A").build())
//                                .build()
//                )
//                .farm(
//                        Farm.builder().id(1L).name("Farm B").build()
//                )
//                .season(
//                        Season.builder().id(2L).name("Season A")
//                                .seasonStartDate(LocalDateTime.of(LocalDate.of(2024, 06, 15), LocalTime.of(0, 0)))
//                                .seasonEndDate(LocalDateTime.of(LocalDate.of(2025, 06, 15), LocalTime.of(0, 0)))
//                                .identifier("SI01").build()
//                )
//                .build());

    }
}
