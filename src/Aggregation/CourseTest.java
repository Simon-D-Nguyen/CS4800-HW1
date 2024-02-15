/*
CourseTest.java
 */

package Aggregation;

public class CourseTest {

    public static void main(String[] args) {

        Textbook textbook1 = new Textbook();
        textbook1.setAuthor("Robert C. Martin");
        textbook1.setTitle("Clean Code");
        textbook1.setPublisher("Pearson");

        Textbook textbook2 = new Textbook();
        textbook2.setAuthor("Simon Nguyen");
        textbook2.setTitle("AAAAAAAAA");
        textbook2.setPublisher("CPP");

        Instructor first = new Instructor();
        first.setInstructorFirstName("Nima");
        first.setInstructorLastName("Davarpanah");
        first.setOfficeNum("3-2636");

        Instructor second = new Instructor();
        second.setInstructorFirstName("Keivan");
        second.setInstructorLastName("Navi");
        second.setOfficeNum("8-42");



        Course newCourse = new Course(textbook1, textbook2, first, second);
        newCourse.setCourseName("CS4800");

        newCourse.print();
    }
}