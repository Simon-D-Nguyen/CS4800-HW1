package Polymorphism;

public class CruiseShip extends Ship {
    private int maxNumOfPassengers;

    public CruiseShip() {
        super();
        setMaxNumOfPassengers(0);
    }

    public CruiseShip(String name,
                      String buildYear,
                      int maxNumOfPassengers) {
        super(name, buildYear);
        setMaxNumOfPassengers(maxNumOfPassengers);
    }

    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + this.getName());
        System.out.println("Max Number of Passengers: " + maxNumOfPassengers);
        System.out.println();
    }
}
