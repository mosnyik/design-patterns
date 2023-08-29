package state.exercise;


public class DirectionService {

    // the initial implementation challenges
    // 1. it uses long list of if-else statements
    // 2. it is not extensible because a change in one place require many more changes around the app
    // 3. not manageable

    // my solution is to use the state pattern to re-group the codes into classes for each enum value
    // 1. the code is very easily extensible
    // 2. it is also very easily manageable


    private Calculation calculate;

    public Object getEta() {

        calculate.getEta();

        return null;
    }

    public Object getDirection() {

        calculate.getDirection();
        return null;
    }

    public Calculation getCalculate() {
        return calculate;
    }

    public void setCalculate(Calculation calculate) {
        this.calculate = calculate;
    }
}