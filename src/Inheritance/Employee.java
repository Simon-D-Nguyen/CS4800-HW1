package src.Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNum;


    public Employee(){
        setFirstName("n/a");
        setLastName("n/a");
        setSocialSecurityNum("n/a");
    }

    public Employee(String firstName, String lastName, String socialSecurityNum){
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNum(socialSecurityNum);
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
