package src.Inheritance;

public class HourlyEmployee extends Employee{
    private int wage;
    private int numOfHoursWorked;

    public HourlyEmployee() {
        super();
        setWage(-1);
        setNumOfHoursWorked(-1);
    }

    public HourlyEmployee(String firstName,
                          String lastName,
                          String socialSecurityNum,
                          int wage,
                          int numOfHoursWorked) {
        super(firstName, lastName, socialSecurityNum);
        setWage(wage);
        setNumOfHoursWorked(numOfHoursWorked);
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
