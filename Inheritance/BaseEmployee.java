package Inheritance;

public class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(){
        super();
        setBaseSalary(-1);
    }

    public BaseEmployee(String firstName,
                        String lastName,
                        String socialSecurityNum,
                        int baseSalary) {
        super(firstName, lastName, socialSecurityNum);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
