package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.entities.Brand;
import com.myelectriccar.cars.entities.Car;
import com.myelectriccar.cars.repositories.BrandRepository;
import com.myelectriccar.cars.requests.CreateBrandInput;
import com.myelectriccar.cars.requests.CreateCarInput;
import com.myelectriccar.cars.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    @Autowired
    public BrandRepository brandRepository;

    @PostMapping("/brands")
    public ResponseEntity<Brand> createBrand(@RequestBody CreateBrandInput createBrandInput) {
        Brand brandCreated = brandRepository.save(createBrandInput.toBrand());

        return new ResponseEntity<>(brandCreated, HttpStatus.CREATED);
    }


}

