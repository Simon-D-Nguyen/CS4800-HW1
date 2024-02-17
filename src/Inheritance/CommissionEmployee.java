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
}
