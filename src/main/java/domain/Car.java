package domain;

public class Car {

    private static final int CAR_NAME_LENGTH_MIN = 1;
    private static final int CAR_NAME_LENGTH_MAX = 5;
    private static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "자동차 이름의 길이는 " + CAR_NAME_LENGTH_MIN + "이상, " + CAR_NAME_LENGTH_MAX + "이하 입니다.";

    private final String name;
    private int forwardNumber;

    public Car(String name) {
        validateLength(name);
        this.name = name;
    }

    public Car(String name, int forwardNumber) {
        this(name);
        this.forwardNumber = forwardNumber;
    }

    private void validateLength(String name) {
        if ((name.length() < CAR_NAME_LENGTH_MIN) || (name.length() > CAR_NAME_LENGTH_MAX)) {
           throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }

    public int getForwardNumber() {
        return forwardNumber;
    }

    public void move() {
        this.forwardNumber++;
    }
}
