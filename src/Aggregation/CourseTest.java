/*
CourseTest.java
 */
package Aggregation;

public class CourseTest {

    public static void main(String[] args) {

        Textbook courseBook = new Textbook();
        courseBook.setAuthor("Robert C. Martin");
        courseBook.setTitle("Clean Code");
        courseBook.setPublisher("Pearson");

        Instructor first = new Instructor();
        first.setInstructorFirstName("Nima");
        first.setInstructorLastName("Davarpanah");
        first.setOfficeNum("3-2636");

        Instructor second = new Instructor();
        second.setInstructorFirstName("Keivan");
        second.setInstructorLastName("Navi");
        second.setOfficeNum("8-42");



        Course newCourse = new Course(courseBook, first, second);
        newCourse.setCourseName("CS4800");

        newCourse.print();
    }
}