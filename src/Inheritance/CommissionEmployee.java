package Inheritance;

public class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(){
        super();
        this.commissionRate = -1;
        this.grossSales = -1;
    }


    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void print() {
        System.out.println("CommissionEmployee: ");
        System.out.println("\tName: " + firstName + " " + lastName);
        System.out.println("\tSSN: " + socialSecurityNum);
        System.out.printf("\tCommission Rate: %,d%%%n", commissionRate);
        System.out.printf("\tGross Sales: $%,d%n", grossSales);
        System.out.println();
    }
}
