package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.services.CompanyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    public CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


}

