package Inheritance;

public class EmployeeTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee1 = new SalariedEmployee();
        salariedEmployee1.setFirstName("Joe");
        salariedEmployee1.setLastName("Jones");
        salariedEmployee1.setWeeklySalary(2500);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee();
        salariedEmployee2.setFirstName("Renwa");
        salariedEmployee2.setLastName("Chanel");
        salariedEmployee2.setSocialSecurityNum("555-55-5555");
        salariedEmployee2.setWeeklySalary(1700);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
        hourlyEmployee1.setFirstName("Stephanie");
        hourlyEmployee1.setLastName("Smith");
        hourlyEmployee1.setWage(25);
        hourlyEmployee1.setNumOfHoursWorked(32);

        HourlyEmployee hourlyEmployee2 = new HourlyEmployee();
        hourlyEmployee2.setFirstName("Mary");
        hourlyEmployee2.setLastName("Quinn");
        hourlyEmployee2.setSocialSecurityNum("333-33-3333");
        hourlyEmployee2.setWage(19);
        hourlyEmployee2.setNumOfHoursWorked(47);

        CommissionEmployee commissionEmployee1 = new CommissionEmployee();
        commissionEmployee1.setFirstName("Nicole");
        commissionEmployee1.setLastName("Dior");
        commissionEmployee1.setSocialSecurityNum("444-44-4444");
        commissionEmployee1.setCommissionRate(15);
        commissionEmployee1.setGrossSales(50000);

        CommissionEmployee commissionEmployee2 = new CommissionEmployee();
        commissionEmployee2.setFirstName("Mahnaz");
        commissionEmployee2.setLastName("Vaziri");
        commissionEmployee2.setCommissionRate(22);
        commissionEmployee2.setGrossSales(40000);


        BaseEmployee baseEmployee1 = new BaseEmployee();
        baseEmployee1.setFirstName("Mike");
        baseEmployee1.setLastName("Davenport");
        baseEmployee1.setSocialSecurityNum("666-66-6666");
        baseEmployee1.setBaseSalary(95000);



    }
}
