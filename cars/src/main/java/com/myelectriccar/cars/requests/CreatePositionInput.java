package com.myelectriccar.cars.requests;

import com.myelectriccar.cars.entities.City;
import com.myelectriccar.cars.entities.Position;
public record CreatePositionInput(String latitude, String longitude, City city) {
    public Position toPosition(){
        Position position = new Position();
        return position;
    }
}
