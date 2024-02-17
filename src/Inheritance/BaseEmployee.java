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
}
