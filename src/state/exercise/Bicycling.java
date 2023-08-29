package state.exercise;

public class Bicycling implements Calculation {
    private int etaMinutes;
    private double remainingDistance;

    private int calculateEtaValue() {

         this.etaMinutes = 15;
        return etaMinutes;
    }


    private double calculateDirectionValue() {

        this.remainingDistance = 100.0;
        return remainingDistance;
    }

    @Override
    public Object getEta() {
        System.out.println("You would be at you destination in 15 minutes using your bicycle");
        return this.etaMinutes;
    }

    @Override
    public Object getDirection() {
        System.out.println("You are 100 meters from your destination on your bicycle");
        return  this.remainingDistance;
    }
}
