package com.car.rental.service.impl;

import com.car.rental.entity.CarInStock;
import com.car.rental.service.CarInStockService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarInStockServiceImplTest {

    @Resource
    private CarInStockService carInStockService;

    @Test
    public void countCarInStockByCarModel() {
        int countCarInStock = carInStockService.countCarInStockByCarModel(2L);
        Assert.assertEquals(countCarInStock,2);
    }

    @Test
    public void getAllCarInStock() {
        List<CarInStock> allCarInStock = carInStockService.getAllCarInStock();
        Assert.assertTrue(!allCarInStock.isEmpty());
    }
}