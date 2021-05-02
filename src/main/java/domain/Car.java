package domain;

public class Car {

    private final String name;
    private int forwardNumber;

    public Car(String name) {

        this.name = name;
        forwardNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getForwardNumber() {
        return forwardNumber;
    }
}
