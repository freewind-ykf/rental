package com.car.rental.controller;

import com.car.rental.entity.*;
import com.car.rental.service.CarInStockService;
import com.car.rental.service.CarModelInfoService;
import com.car.rental.service.CarOrderService;
import com.car.rental.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car-order")
public class CarOrderController {
    @Autowired
    private CarOrderService carOrderService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private CarModelInfoService carModelInfoService;

    @Autowired
    private CarInStockService carInStockService;

    @ApiOperation("Place an car rental order")
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public ResponseMsg order(@RequestBody CarOrder carOrder){
        Long carModelId = carOrder.getCarModel();
        Long userId = carOrder.getUserid();
        UserInfo userInfo = userInfoService.getUserInfoById(userId);
        ResponseMsg responseMsg = new ResponseMsg();
        if (null!=userInfo){
            int countCarInStock = carInStockService.countCarInStockByCarModel(carModelId);
            if (countCarInStock>0){
                carOrderService.addCarOrder(carOrder);
                responseMsg.setCode("0000");
                responseMsg.setMsg("success, place an order successfully");
                return responseMsg;
            } else {
                responseMsg.setCode("9999");
                responseMsg.setMsg("fail, there is not enough car in stock");
                return responseMsg;
            }
        } else {
            responseMsg.setCode("9998");
            responseMsg.setMsg("fail, userid not exist");
            return responseMsg;
        }
    }

    @ApiOperation("Get the car rental order ")
    @RequestMapping(value = "/get-my-car-order",method = RequestMethod.GET)
    public List<CarOrder> getMyCarOrder(@RequestParam(value = "id", required = true) Long id){
        List<CarOrder> carOrder = carOrderService.getCarOrderByUserId(id);
        return carOrder;
    }

}
