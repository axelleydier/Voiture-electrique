package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.City;
import com.myelectriccar.cars.entities.Company;
import com.myelectriccar.cars.entities.Position;
import com.myelectriccar.cars.entities.Terminal;
public record CreateTerminalInput(String type, Position position, Company company) {
    public Terminal toTerminal(){
        Terminal terminal = new Terminal();
        return terminal;
    }
}
