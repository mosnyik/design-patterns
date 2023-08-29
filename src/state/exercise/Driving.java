package state.exercise;

public class Driving implements  Calculation{

    private int etaMinutes;
    private double remainingDistance;

    private int calculateEtaValue() {

        this.etaMinutes = 3;
        return etaMinutes;
    }


    private double calculateDirectionValue() {

        this.remainingDistance = 50.0;
        return remainingDistance;
    }
    @Override
    public Object getEta() {
        System.out.println("You would be at you destination in 3 minutes using your car");
        return this.etaMinutes;
    }

    @Override
    public Object getDirection() {
        System.out.println("You are 50 meters from your destination in your car");
        return  this.remainingDistance;
    }
}
