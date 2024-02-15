package Inheritance;

public class EmployeeTest {

    public static void main(String[] args) {

        BaseEmployee bE = new BaseEmployee("First", "Last", "11223344", 3);

        bE.setFirstName("Sam");
        bE.setLastName("NO");
        bE.setSocialSecurityNum("111-11-1111");
        bE.setBaseSalary(1);

        System.out.println(bE.getLastName());
    }
}
