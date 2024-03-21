package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.services.CityService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    public CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
}
