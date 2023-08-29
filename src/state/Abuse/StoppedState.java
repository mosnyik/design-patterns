package state.Abuse;


public class StoppedState implements State{
    private final Stopwatch stopWatch;
    public StoppedState(Stopwatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
