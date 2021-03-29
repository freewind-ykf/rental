package com.car.rental.service.impl;

import com.car.rental.entity.CarOrder;
import com.car.rental.mapper.CarOrderMapper;
import com.car.rental.service.CarOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carOrderService")
public class CarOrderServiceImpl implements CarOrderService {
    @Autowired
    private CarOrderMapper carOrderMapper;

    @Override
    public CarOrder getCarOrderById(Long id) {
        return carOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CarOrder> getCarOrderByUserId(Long userid) {
        return carOrderMapper.getCarOrderByUserId(userid);
    }

    @Override
    public void addCarOrder(CarOrder carOrder) {
        carOrderMapper.insert(carOrder);
    }
}
