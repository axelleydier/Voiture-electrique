package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.Brand;
import com.myelectriccar.cars.entities.Car;
public record CreateCarInput(String model, Brand brand) {
    public Car toCar(){
        Car car = new Car();
        return car;
    }
}
