package Inheritance;

public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee() {
        super();
        this.weeklySalary = -1;
    }

    public int getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void print() {
        System.out.println("SalariedEmployee: ");
        System.out.println("\tName: " + firstName + " " + lastName);
        System.out.printf("\tWeekly Salary: $%,d%n", weeklySalary);
        System.out.println();
    }
}
