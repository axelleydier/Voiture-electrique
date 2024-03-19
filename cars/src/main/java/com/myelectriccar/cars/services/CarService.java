package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.Car;
import com.myelectriccar.cars.repositories.CarRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);

        return cars;
    }

    public Optional<Car> findById(int id) {
        return carRepository.findById(id);
    }

    public Car update(Car carToUpdate) {
        return carRepository.save(carToUpdate);
    }

    public void delete(int id) {
        carRepository.deleteById(id);
    }
}
