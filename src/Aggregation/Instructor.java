/*
Instructor.java
 */

package Aggregation;

public class Instructor {

    private String instructorFirstName;
    private String instructorLastName;
    private String officeNum;

    public Instructor() {
        this.instructorFirstName = "n/a";
        this.instructorLastName = "n/a";
        this.officeNum = "n/a";
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    public String getOfficeNum() {
        return officeNum;
    }

}
