package com.car.rental.entity;

public class CarInStock {
    private Integer id;

    private Integer carModel;

    private Integer inStock;

    private CarModelInfo carModelInfo;

    public CarInStock(Integer id, Integer carModel, Integer inStock) {
        this.id = id;
        this.carModel = carModel;
        this.inStock = inStock;
    }

    public CarInStock() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarModel() {
        return carModel;
    }

    public void setCarModel(Integer carModel) {
        this.carModel = carModel;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }

    public CarModelInfo getCarModelInfo() {
        return carModelInfo;
    }

    public void setCarModelInfo(CarModelInfo carModelInfo) {
        this.carModelInfo = carModelInfo;
    }

    @Override
    public String toString() {
        return "CarInStock{" +
                "id=" + id +
                ", carModel=" + carModel +
                ", inStock=" + inStock +
                '}';
    }
}