package state.Abuse;
 public class RunningState implements State{
      private final Stopwatch stopWatch;
      public RunningState(Stopwatch stopWatch) {
          this.stopWatch = stopWatch;
      }

      @Override
    public void click() {
stopWatch.setCurrentState(new StoppedState(stopWatch));
        System.out.println("Stopped");
    }
}
