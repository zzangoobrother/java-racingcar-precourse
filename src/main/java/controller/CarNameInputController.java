package controller;

public class CarNameInputController {

    public String[] divideName(String carName) {
        return carName.split(",");
    }
}
