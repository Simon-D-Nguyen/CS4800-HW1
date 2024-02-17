/*
ShipTest.java
 */

package Polymorphism;

public class ShipTest {

    public static void main(String[] args) {

        Ship[] listOfShips = new Ship[3];

        Ship newShip = new Ship();
        newShip.setName("SS. Ship");
        newShip.setBuildYear("2001");

        listOfShips[0] = newShip;

        CruiseShip newCruiseShip = new CruiseShip();
        newCruiseShip.setName("SS. Cruise");
        newCruiseShip.setBuildYear("2002");
        newCruiseShip.setMaxNumOfPassengers(200);
        listOfShips[1] = newCruiseShip;

        CargoShip newCargoShip = new CargoShip();
        newCargoShip.setName("SS. Cargo");
        newCargoShip.setBuildYear("2003");
        newCargoShip.setCargoCapacityInTon(4000);
        listOfShips[2] = newCargoShip;


        for(Ship ships : listOfShips) {
            ships.print();
        }
    }
}
