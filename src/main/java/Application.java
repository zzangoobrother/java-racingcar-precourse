import view.RacingView;

public class Application {

    public static void main(String[] args) {
        RacingView racingView = new RacingView();

        racingView.racingStart();
        racingView.attempInput();
        racingView.run();
        racingView.winnerPrint();
    }
}
