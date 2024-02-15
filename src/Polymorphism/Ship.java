/*
Ship.java
 */

package Polymorphism;

public class Ship {
    protected String name;
    protected String buildYear;

    public Ship() {
        this.name = "n/a";
        this.buildYear = "0";
    }

    public Ship(String name, String buildYear) {
        this.name = name;
        this.buildYear = buildYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Build Year: " + buildYear);
        System.out.println();
    }
}
