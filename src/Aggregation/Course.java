/*
Course.java
 */

package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;


    public Course() {
        this.courseName = "n/a";
        this.instructor1 = null;
        this.instructor2 = null;
        this.textbook1 = null;
        this.textbook2 = null;
    }

    public Course(Textbook textbook1, Textbook textbook2, Instructor instructor1,
                  Instructor instructor2) {
        this.courseName = "n/a";
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }


    public void setInstructor1(Instructor instructor1) {
        this.instructor1 = instructor1;
    }

    public Instructor getInstructor1() {
        return instructor1;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }

    public Instructor getInstructor2() {
        return instructor2;
    }

    public void setTextbook1(Textbook textbook1) {
        this.textbook1 = textbook1;
    }

    public Textbook getTextbook1() {
        return textbook1;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    public Textbook getTextbook2() {
        return textbook2;
    }

    public void print() {
        System.out.println("Course Name: " + courseName);

        System.out.println("Instructors (Last, First): ");
        System.out.println("\t" + instructor1.getInstructorLastName() + ", "
                + instructor1.getInstructorFirstName());
        System.out.println("\t" + instructor2.getInstructorLastName() + ", " +
                instructor2.getInstructorFirstName());

        System.out.println("Textbooks: ");
        System.out.println("\t- Title: " + this.textbook1.getTitle());
        System.out.println("\t\t- Author: " + this.textbook1.getAuthor());
        System.out.println("\t- Title: " + this.textbook2.getTitle());
        System.out.println("\t\t- Author: " + this.textbook2.getAuthor());

    }
}