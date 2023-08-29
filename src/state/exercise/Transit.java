package state.exercise;

public class Transit implements Calculation{
    private int etaMinutes;
    private double remainingDistance;

    private int calculateEtaValue() {

        this.etaMinutes = 10;
        return etaMinutes;
    }


    private double calculateDirectionValue() {

        this.remainingDistance = 80.0;
        return remainingDistance;
    }

    @Override
    public Object getEta() {
        System.out.println("You would be at you destination in 10 minutes using the bus");
        return this.etaMinutes;
    }

    @Override
    public Object getDirection() {
        System.out.println("You are 80.0 meters from your destination by public transport");
        return  this.remainingDistance;
    }
}
