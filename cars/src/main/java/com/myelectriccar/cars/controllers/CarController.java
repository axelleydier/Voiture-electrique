package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.entities.Car;
import com.myelectriccar.cars.repositories.CarRepository;
import com.myelectriccar.cars.requests.CreateCarInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    public CarRepository carRepository;

    @PostMapping("/cars")
    public ResponseEntity<Car> createCar(@RequestBody CreateCarInput createCarInput) {
        Car carCreated = carRepository.save(createCarInput.toCar());

        return new ResponseEntity<>(carCreated, HttpStatus.CREATED);
    }
}