package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.Brand;
public record CreateBrandInput(String model, String link) {
    public Brand toBrand(){
        Brand brand = new Brand();
        return brand;
    }
}