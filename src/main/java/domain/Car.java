package domain;

public class Car {

    private static final int CAR_NAME_LENGTH_MIN = 1;
    private static final int CAR_NAME_LENGTH_MAX = 9;

    private final String name;
    private int forwardNumber;

    public Car(String name) {
        validateLength(name);
        this.name = name;
        forwardNumber = 0;
    }

    private void validateLength(String name) {
        if ((name.length() < CAR_NAME_LENGTH_MIN) || (name.length() > CAR_NAME_LENGTH_MIN)) {
           throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getForwardNumber() {
        return forwardNumber;
    }
}
