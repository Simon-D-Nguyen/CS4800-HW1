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
}
