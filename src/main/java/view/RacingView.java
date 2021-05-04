package view;

import controller.CarNameInputController;
import controller.RacingController;
import domain.Attemp;
import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingView {

    final Scanner sc = new Scanner(System.in);
    List<Car> cars = new ArrayList<>();

    CarNameInputController carNameInputController = new CarNameInputController();
    RacingController racingController = new RacingController();
    Attemp attemp;

    public void racingStart() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        cars = carNameInputController.carsCreate(sc.nextLine());
    }

    public void attempInput() {
        System.out.println("시도할 회수는 몇회인가요?");
        attemp = new Attemp(sc.nextLine());
        
    }

    public void run() {
        System.out.println("실행 결과");

        for (int index = 0; index < attemp.getAttempNumber(); index++) {
            carsForwardPrint();
        }
    }

    public void carsForwardPrint() {
        for (int index = 0; index < cars.size(); index++) {
            System.out.print(cars.get(index).getName() + " : ");
            carRandom(cars.get(index));
            carPrint(cars.get(index));
        }
        System.out.println();
    }

    public void carRandom(Car car) {
        if (racingController.getRandomForward() >= 4) {
            car.move();
        }
    }

    public void carPrint(Car car) {
        for (int index = 0; index < car.getForwardNumber(); index++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void winnerPrint() {
        StringBuilder sb = racingController.getWinnerCarName(cars);
        System.out.println(sb.toString().substring(0, sb.length() - 2) + "가 최종 우승했습니다.");
    }
}
