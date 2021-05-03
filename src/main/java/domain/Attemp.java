package domain;

public class Attemp {

    int attempNumber;

    public Attemp(String number) {
        attempNumber = Integer.parseInt(number);
    }

    public int getAttempNumber() {
        return attempNumber;
    }
}
