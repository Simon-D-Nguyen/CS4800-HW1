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

        Instructor instructor1 = new Instructor();
        instructor1.setInstructorFirstName("Nima");
        instructor1.setInstructorLastName("Davarpanah");
        instructor1.setOfficeNum("3-2636");

        Instructor instructor2 = new Instructor();
        instructor2.setInstructorFirstName("Keivan");
        instructor2.setInstructorLastName("Navi");
        instructor2.setOfficeNum("8-42");



        Course newCourse = new Course();
        newCourse.setCourseName("CS4800");
        newCourse.addInstructor(instructor1);
        newCourse.addInstructor(instructor2);
        newCourse.addTextbook(textbook1);
        newCourse.addTextbook(textbook2);

        newCourse.print();
    }
}