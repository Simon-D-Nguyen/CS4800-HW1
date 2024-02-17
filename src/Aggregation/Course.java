/*
Course.java
 */

package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;
    private int numberOfInstructors;
    private int numberOfTextbooks;


    public Course() {
        this.courseName = "n/a";
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
        numberOfInstructors = 0;
        numberOfTextbooks = 0;
    }


    private boolean numCheck(int maximum, int number) {
        if (number > maximum || number < 1){
            return false;
        }
        else {
            return true;
        }
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }


    public void addInstructor(Instructor instructor){
        this.instructors.add(instructor);
        numberOfInstructors++;
    }


    public Instructor getInstructor(int number) {
        if (numCheck(numberOfInstructors, number)) {
            return instructors.get(number - 1);
        }
        else {
            System.out.println("Instructor number not available");
            return null;
        }
    }

    public void removeInstructor(int number) {
        if (numCheck(numberOfInstructors, number)) {
            instructors.remove(number - 1);
        }
        else {
            System.out.println("Instructor number not available");
        }
    }


    public void addTextbook(Textbook textbook) {
        textbooks.add(numberOfTextbooks, textbook);
        numberOfTextbooks++;
    }


    public Textbook getTextbook(int number) {
        if (numCheck(numberOfTextbooks, number)) {
            return textbooks.get(number - 1);
        }
        else {
            System.out.println("Book number not available.");
            return null;
        }
    }

    public void removeTextbook(int number) {
        if (numCheck(numberOfTextbooks, number)) {
            textbooks.remove(number - 1);
        }
        else {
            System.out.println("Textbook number not available");
        }
    }


    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructors (Last, First): ");
        for(Instructor instructor : instructors) {
            System.out.println("\t- " + instructor.getInstructorLastName() + ", "
                    + instructor.getInstructorFirstName());
        }

        System.out.println("Textbooks: ");
        for(Textbook textbook : textbooks) {
            System.out.println("\t- Title: " + textbook.getTitle());
            System.out.println("\t\t- Author: " + textbook.getAuthor());
        }
    }
}