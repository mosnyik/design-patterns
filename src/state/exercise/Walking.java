package state.exercise;

public class Walking implements Calculation{
    private int etaMinutes;
    private double remainingDistance;

    private int calculateEtaValue() {

        this.etaMinutes = 30;
        return etaMinutes;
    }


    private double calculateDirectionValue() {

        this.remainingDistance = 120.0;
        return remainingDistance;
    }

    @Override
    public Object getEta() {
        System.out.println("You would be at you destination in 30 minutes using your legs");
        return this.etaMinutes;
    }

    @Override
    public Object getDirection() {
        System.out.println("You are 120 meters from your destination by trekking");
        return  this.remainingDistance;
    }
}
