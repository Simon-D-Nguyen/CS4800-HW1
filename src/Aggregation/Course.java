package Aggregation;

public class Course {
    private String courseName;
    private String instructorFirstName;
    private String instructorLastName;
    private String officeNum;
    private Textbook textbook;


    public Course(Textbook textbook) {
        setCourseName("n/a");
        setInstructorFirstName("n/a");
        setInstructorFirstName("n/a");
        setOfficeNum("n/a");
        this.textbook = textbook;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
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


    public void print() {
        String instuctorName = instructorLastName + ", " + instructorFirstName;
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor Name (Last, First): " + instuctorName);
        System.out.println("Textbook: ");
        System.out.println("\tTitle: " + this.textbook.getTitle());
        System.out.println("\tAuthor: " + this.textbook.getAuthor());
    }

}