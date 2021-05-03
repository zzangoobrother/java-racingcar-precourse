package controller;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarNameInputController {

    public String[] divideName(String carName) {
        return carName.split(",");
    }

    public List<Car> carsCreate(String carName) {
        return getCars(divideName(carName));
    }

    public List<Car> getCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

}
