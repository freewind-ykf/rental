package com.car.rental.service.impl;

import com.car.rental.entity.CarModelInfo;
import com.car.rental.service.CarModelInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarModelInfoServiceImplTest {

    @Resource
    private CarModelInfoService carModelInfoService;


    @Test
    public void getCarModelInfoById() {
        CarModelInfo carModelInfo = carModelInfoService.getCarModelInfoById(1);
        Assert.assertNotNull(carModelInfo);
    }
}