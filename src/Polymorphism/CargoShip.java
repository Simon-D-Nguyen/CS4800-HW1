package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {
        super();
        setCargoCapacity(-1);
    }
    public CargoShip(String name,
                     String buildYear,
                     int cargoCapacity) {
        super(name, buildYear);
        setCargoCapacity(cargoCapacity);
    }


    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("src.Ship Name: " + this.getName());
        System.out.println("Cargo Capacity (tons): " + cargoCapacity);
        System.out.println();
    }
}
