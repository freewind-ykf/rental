package com.car.rental.service;

import com.car.rental.entity.CarOrder;

import java.util.List;

public interface CarOrderService {
    CarOrder getCarOrderById(Long id);

    List<CarOrder> getCarOrderByUserId(Long userid);

    void addCarOrder(CarOrder carOrder);
}
