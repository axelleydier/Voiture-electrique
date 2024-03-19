package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.Company;
import com.myelectriccar.cars.repositories.CompanyRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company create(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> findAll() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);

        return companies;
    }

    public Optional<Company> findById(int id) {
        return companyRepository.findById(id);
    }

    public Company update(Company companyToUpdate) {
        return companyRepository.save(companyToUpdate);
    }

    public void delete(int id) {
        companyRepository.deleteById(id);
    }
}
