package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private static final String CAR_NAME_DUPLICATION_ERROR_MESSAGE = "자동차 이름이 중복 되었습니다.";

    private List<Car> cars;

    public Cars(List<Car> cars) {
        validateDuplication(cars);
        this.cars = cars;
    }

    private void validateDuplication(List<Car> cars) {
        Set<String> duplicatedNames = convertName(cars);

        if (duplicatedNames.size() != cars.size()) {
            throw new IllegalArgumentException(CAR_NAME_DUPLICATION_ERROR_MESSAGE);
        }
    }

    private Set<String> convertName(List<Car> cars) {
        Set<String> duplicatedNames = new HashSet<>();
        for (Car car : cars) {
            duplicatedNames.add(car.getName());
        }
        return duplicatedNames;
    }

}
