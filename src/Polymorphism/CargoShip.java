/*
CargoShip.java
 */

package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacityInTons;

    public CargoShip() {
        super();
        this.cargoCapacityInTons = -1;
    }

    public void setCargoCapacityInTon(int cargoCapacityInTons) {
        this.cargoCapacityInTons = cargoCapacityInTons;
    }

    public int getCargoCapacityInTons() {
        return cargoCapacityInTons;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + this.getName());
        System.out.println("Cargo Capacity (tons): " + cargoCapacityInTons);
        System.out.println();
    }
}
