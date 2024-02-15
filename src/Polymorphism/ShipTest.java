/*
ShipTest.java
 */

package Polymorphism;

public class ShipTest {

    public static void main(String[] args) {

        Ship[] listOfShips = new Ship[3];

        listOfShips[0] = new Ship("One", "2000");
        listOfShips[1] = new CruiseShip("Three", "2003", 1);
        listOfShips[2] = new CargoShip("Two", "2001", 15);


        for(Ship ships : listOfShips) {
            ships.print();
        }
    }
}
