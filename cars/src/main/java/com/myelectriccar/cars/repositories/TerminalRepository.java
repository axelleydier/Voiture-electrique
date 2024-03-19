package com.myelectriccar.cars.repositories;

import com.myelectriccar.cars.entities.Terminal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends CrudRepository<Terminal, Integer> {

}
