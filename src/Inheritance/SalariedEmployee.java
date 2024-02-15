package Inheritance;

public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee() {
        super();
        setWeeklySalary(-1);
    }

    public SalariedEmployee(String firstName,
                            String lastName,
                            String socialSecurityNum,
                            int weeklySalary){
        super(firstName, lastName, socialSecurityNum);
        setWeeklySalary(weeklySalary);
    }


    public int getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
