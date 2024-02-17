/*
CruiseShip.java
 */

package Polymorphism;

public class CruiseShip extends Ship {
    private int maxNumOfPassengers;

    public CruiseShip() {
        super();
        this.maxNumOfPassengers = 0;
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
