package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.services.PositionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositionController {
    public PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }


}
