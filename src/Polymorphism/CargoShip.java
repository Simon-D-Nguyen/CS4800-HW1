package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacityInTon;

    public CargoShip() {
        super();
        this.cargoCapacityInTon = -1;
    }
    public CargoShip(String name,
                     String buildYear,
                     int cargoCapacityInTon) {
        super(name, buildYear);
        this.cargoCapacityInTon = cargoCapacityInTon;
    }


    public void setcargoCapacityInTon(int cargoCapacityInTon) {
        this.cargoCapacityInTon = cargoCapacityInTon;
    }

    public int getcargoCapacityInTon() {
        return cargoCapacityInTon;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + this.getName());
        System.out.println("Cargo Capacity (tons): " + cargoCapacityInTon);
        System.out.println();
    }
}
