package com.car.rental.service;

import com.car.rental.entity.CarInStock;

import java.util.List;

public interface CarInStockService {
    int countCarInStockByCarModel(Long id);

    List<CarInStock> getAllCarInStock();
}
