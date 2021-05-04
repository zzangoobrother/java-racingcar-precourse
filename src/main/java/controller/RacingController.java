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

    public int getRandomForward() {
        return (int) (Math.random() * 9);
    }

    public StringBuilder getWinnerCarName(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        int max = getMaxForward(cars);
        for (Car car : cars) {
            sb = sameMaxForwardCar(max, car, sb);
        }
        return sb;
    }

    private StringBuilder sameMaxForwardCar(int max, Car car, StringBuilder sb) {
        if (max == car.getForwardNumber()) {
            return sb.append(car.getName() + ", ");
        }
        return sb;
    }
}
