package com.myelectriccar.cars.repositories;

import com.myelectriccar.cars.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

}
