package controller;

import domain.Attemp;
import domain.Car;
import domain.Cars;

import java.util.List;

public class RacingController {

    public int getMaxForward(List<Car> cars) {
        int max = 0;
        for (Car car : cars) {
            max = compareForward(max, car.getForwardNumber());
        }
        return max;
    }

    private int compareForward(int max, int forwardNumber) {
        return Math.max(max, forwardNumber);
    }
}
