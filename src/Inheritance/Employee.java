package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNum;


    public Employee(){
        this.firstName = "n/a";
        this.lastName = "n/a";
        this.socialSecurityNum = "n/a";
    }

    public Employee(String firstName, String lastName, String socialSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNum = socialSecurityNum;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

}
