package Aggregation;

public class CourseTest {

    public static void main(String[] args) {

        Textbook courseBook = new Textbook();
        courseBook.setAuthor("Simon Eggo");
        courseBook.setTitle("The Ads");
        courseBook.setPublisher("Penguin");


        Course newCourse = new Course(courseBook);
        newCourse.setCourseName("CS4800");
        newCourse.setInstructorFirstName("Nima");
        newCourse.setInstructorLastName("Davarpanah");
        newCourse.setOfficeNum("3-2636");

        newCourse.print();
    }
}