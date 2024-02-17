package Inheritance;

public class HourlyEmployee extends Employee{
    private int wage;
    private int numOfHoursWorked;

    public HourlyEmployee() {
        super();
        this.wage = -1;
        this.numOfHoursWorked = -1;
    }


    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    public void setNumOfHoursWorked(int numOfHoursWorked) {
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public int getNumOfHoursWorked() {
        return numOfHoursWorked;
    }

    public void print() {
        System.out.println("HourlyEmployee: ");
        System.out.println("\tName: " + firstName + " " + lastName);
        System.out.printf("\tWage: $%,d%n", wage);
        System.out.printf("\tHours Worked: %d%n", numOfHoursWorked);
        System.out.println();
    }

}
