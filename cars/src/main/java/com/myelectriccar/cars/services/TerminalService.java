package com.myelectriccar.cars.services;

import com.myelectriccar.cars.entities.Terminal;
import com.myelectriccar.cars.repositories.TerminalRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
public class TerminalService {

    private final TerminalRepository terminalRepository;

    public TerminalService(TerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    public Terminal create(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    public List<Terminal> findAll() {
        List<Terminal> terminals = new ArrayList<>();
        terminalRepository.findAll().forEach(terminals::add);

        return terminals;
    }

    public Optional<Terminal> findById(int id) {
        return terminalRepository.findById(id);
    }

    public Terminal update(Terminal terminalToUpdate) {
        return terminalRepository.save(terminalToUpdate);
    }

    public void delete(int id) {
        terminalRepository.deleteById(id);
    }
}
