package com.car.rental.entity;

import java.util.Date;

public class CarOrder {
    private Long id;

    private Long carModel;

    private Date rentStartDate;

    private Date rentEndDate;

    private Long userid;

    public CarOrder(Long id, Long carModel, Date rentStartDate, Date rentEndDate, Long userid) {
        this.id = id;
        this.carModel = carModel;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.userid = userid;
    }

    public CarOrder() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarModel() {
        return carModel;
    }

    public void setCarModel(Long carModel) {
        this.carModel = carModel;
    }

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "CarOrder{" +
                "id=" + id +
                ", carModel=" + carModel +
                ", rentStartDate=" + rentStartDate +
                ", rentEndDate=" + rentEndDate +
                ", userid=" + userid +
                '}';
    }
}