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
}
