package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.Position;
import com.myelectriccar.cars.repositories.PositionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class PositionService {

    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public Position create(Position position) {
        return positionRepository.save(position);
    }

    public List<Position> findAll() {
        List<Position> positions = new ArrayList<>();
        positionRepository.findAll().forEach(positions::add);

        return positions;
    }

    public Optional<Position> findById(int id) {
        return positionRepository.findById(id);
    }

    public Position update(Position positionToUpdate) {
        return positionRepository.save(positionToUpdate);
    }

    public void delete(int id) {
        positionRepository.deleteById(id);
    }
}
