package com.small.service.smallService;

import com.small.service.entity.SmallEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ServicesClassTest {

    @Autowired
    ServicesClass servicesClass;

    @Test
    void testSaveFunction()
    {
        SmallEntity entity = SmallEntity.builder()
                .totalNumber(100)
                .small_id(10L)
                .cost(200.0)
                .name("Biscuit")
                .sellingPrice(220.0)
                .build();
       SmallEntity savedEntity= servicesClass.saveEntity(entity);
       assertEquals(entity,savedEntity);
    }

}