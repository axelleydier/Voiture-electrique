package com.myelectriccar.cars.repositories;

import com.myelectriccar.cars.entities.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

}
