package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.Brand;
import com.myelectriccar.cars.repositories.BrandRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    public List<Brand> findAll() {
        List<Brand> brands = new ArrayList<>();
        brandRepository.findAll().forEach(brands::add);

        return brands;
    }

    public Optional<Brand> findById(int id) {
        return brandRepository.findById(id);
    }

    public Brand update(Brand brandToUpdate) {
        return brandRepository.save(brandToUpdate);
    }

    public void delete(int id) {
        brandRepository.deleteById(id);
    }
}
