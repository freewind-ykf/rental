package com.car.rental.service.impl;

import com.car.rental.entity.CarInStock;
import com.car.rental.entity.UserInfo;
import com.car.rental.mapper.CarInStockMapper;
import com.car.rental.mapper.UserInfoMapper;
import com.car.rental.service.CarInStockService;
import com.car.rental.service.UserInfoService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carInStockService")
public class CarInStockServiceImpl implements CarInStockService {
    @Autowired
    private CarInStockMapper carInStockMapper;

    @Override
    public int countCarInStockByCarModel(Long carModel) {
        return carInStockMapper.countCarInStockByCarModel(carModel);
    }

    @Override
    public List<CarInStock> getAllCarInStock() {
        return carInStockMapper.getAllCarInStock();
    }
}
