package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.City;

public record CreateCityInput(String  name, Integer postalCode) {
    public City toCity(){
        City city = new City();
        return city;
    }
}