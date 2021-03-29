package com.car.rental.controller;

import com.car.rental.entity.CarInStock;
import com.car.rental.entity.CarModelInfo;
import com.car.rental.service.CarInStockService;
import com.car.rental.service.CarModelInfoService;
import com.car.rental.service.CarOrderService;
import com.car.rental.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car-in-stock")
public class CarInStockController {

    @Autowired
    private CarModelInfoService carModelInfoService;

    @Autowired
    private CarInStockService carInStockService;

    @ApiOperation("Get all cars in stock")
    @RequestMapping(value = "/get-all-car-in-stock",method = RequestMethod.GET)
    public List<CarInStock> getAllCarInStock(){
        List<CarInStock> carInStock = carInStockService.getAllCarInStock();
        List<CarInStock> res = new ArrayList<>();
        for (CarInStock inStock : carInStock) {
            CarModelInfo carModelInfo = carModelInfoService.getCarModelInfoById(inStock.getCarModel());
            inStock.setCarModelInfo(carModelInfo);
            res.add(inStock);
        }
        return res;
    }
}
