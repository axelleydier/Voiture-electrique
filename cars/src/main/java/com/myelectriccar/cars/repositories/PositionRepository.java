package com.myelectriccar.cars.repositories;

import com.myelectriccar.cars.entities.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CrudRepository<Position, Integer> {

}
