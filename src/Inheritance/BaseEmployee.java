package Inheritance;

public class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(){
        super();
        this.baseSalary = -1;
    }


    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void print() {
        System.out.println("BaseEmployee: ");
        System.out.println("\tName: " + firstName + " " + lastName);
        System.out.printf("\tBase Salary: $%,d%n", baseSalary);
        System.out.println();
    }
}
