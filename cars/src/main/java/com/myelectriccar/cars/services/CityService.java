package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.City;
import com.myelectriccar.cars.repositories.CityRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City create(City city) {
        return cityRepository.save(city);
    }

    public List<City> findAll() {
        List<City> cities = new ArrayList<>();
        cityRepository.findAll().forEach(cities::add);

        return cities;
    }

    public Optional<City> findById(int id) {
        return cityRepository.findById(id);
    }

    public City update(City cityToUpdate) {
        return cityRepository.save(cityToUpdate);
    }

    public void delete(int id) {
        cityRepository.deleteById(id);
    }
}
