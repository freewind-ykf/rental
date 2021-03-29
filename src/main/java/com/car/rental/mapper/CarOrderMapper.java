package com.car.rental.mapper;

import com.car.rental.entity.CarOrder;

import java.util.List;

public interface CarOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CarOrder record);

    int insertSelective(CarOrder record);

    CarOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarOrder record);

    int updateByPrimaryKey(CarOrder record);

    List<CarOrder> getCarOrderByUserId(Long userid);
}