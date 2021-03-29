package com.car.rental.mapper;

import com.car.rental.entity.CarModelInfo;

public interface CarModelInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarModelInfo record);

    int insertSelective(CarModelInfo record);

    CarModelInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarModelInfo record);

    int updateByPrimaryKey(CarModelInfo record);
}