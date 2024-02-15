/*
Course.java
 */

package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook;


    public Course(Textbook textbook, Instructor instructor1,
                  Instructor instructor2) {
        setCourseName("n/a");
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook = textbook;
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

    public void print() {
        System.out.println("Course Name: " + courseName);

        System.out.println("Instructors (Last, First): ");
        System.out.println("\t" + instructor1.getInstructorFirstName() + ", "
                + instructor1.getInstructorFirstName());
        System.out.println("\t" + instructor2.getInstructorLastName() + ", " +
                instructor2.getInstructorFirstName());

        System.out.println("Textbook: ");
        System.out.println("\t- Title: " + this.textbook.getTitle());
        System.out.println("\t- Author: " + this.textbook.getAuthor());
    }

}