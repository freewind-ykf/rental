package com.car.rental.entity;

public class CarModelInfo {
    private Integer id;

    private String carModel;

    private String color;

    private String level;

    private String manufacturer;

    private String rentPrice;

    public CarModelInfo(Integer id, String carModel, String color, String level, String manufacturer, String rentPrice) {
        this.id = id;
        this.carModel = carModel;
        this.color = color;
        this.level = level;
        this.manufacturer = manufacturer;
        this.rentPrice = rentPrice;
    }

    public CarModelInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel == null ? null : carModel.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice == null ? null : rentPrice.trim();
    }

    @Override
    public String toString() {
        return "CarModelInfo{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", level='" + level + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", rentPrice='" + rentPrice + '\'' +
                '}';
    }
}