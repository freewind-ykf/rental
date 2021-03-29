package com.car.rental.service.impl;

import com.car.rental.entity.CarOrder;
import com.car.rental.service.CarOrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarOrderServiceImplTest {

    @Resource
    private CarOrderService carOrderService;

    @Test
    public void getCarOrderById() {
        CarOrder carOrder = carOrderService.getCarOrderById(1L);
        Assert.assertNotNull(carOrder);
    }

    @Test
    public void getCarOrderByUserId() {
        List<CarOrder> carOrders = carOrderService.getCarOrderByUserId(1L);
        Assert.assertFalse(carOrders.isEmpty());
    }

}