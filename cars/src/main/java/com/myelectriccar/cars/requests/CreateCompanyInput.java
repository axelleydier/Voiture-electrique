package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.City;
import com.myelectriccar.cars.entities.Company;

public record CreateCompanyInput(String name) {
    public Company toCompany(){
        Company company = new Company();
        return company;
    }
}