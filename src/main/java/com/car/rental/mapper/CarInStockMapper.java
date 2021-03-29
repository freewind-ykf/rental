package com.car.rental.mapper;

import com.car.rental.entity.CarInStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarInStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarInStock record);

    int insertSelective(CarInStock record);

    CarInStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarInStock record);

    int updateByPrimaryKey(CarInStock record);

    List<CarInStock> getAllCarInStock();

    int countCarInStockByCarModel(Long id);
}