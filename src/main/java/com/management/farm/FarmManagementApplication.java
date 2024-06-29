package com.management.farm;

import com.management.farm.api.CropDetailsController;
import com.management.farm.api.FarmController;
import com.management.farm.domain.model.CropDetailsSearchDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FarmManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(FarmManagementApplication.class, args);

        FarmController farmControllerBean = applicationContext.getBean(FarmController.class);
        farmControllerBean.getAll();

/*        CropDetailsController cropDetailsController = applicationContext.getBean(CropDetailsController.class);
        cropDetailsController.getAllByCriteria(
               CropDetailsSearchDto.builder()
                       .farmIdentifier("FA01")
                       .seasonIdentifier("SI02")
                       .cropIdentifier("CI01")
                       .build()
        );*/
    }

}
