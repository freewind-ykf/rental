package com.car.rental.service.impl;

import com.car.rental.entity.CarModelInfo;
import com.car.rental.mapper.CarModelInfoMapper;
import com.car.rental.service.CarModelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carModelInfoService")
public class CarModelInfoServiceImpl implements CarModelInfoService {
    @Autowired
    private CarModelInfoMapper carModelInfoMapper;

    @Override
    public CarModelInfo getCarModelInfoById(Integer id) {
        return carModelInfoMapper.selectByPrimaryKey(id);
    }
}
