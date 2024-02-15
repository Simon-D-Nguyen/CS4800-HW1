package Aggregation;

public class CourseTest {

    public static void main(String[] args) {

        Textbook courseBook = new Textbook();
        courseBook.setAuthor("Robert C. Martin");
        courseBook.setTitle("Clean Code");
        courseBook.setPublisher("Pearson");


        Course newCourse = new Course(courseBook);
        newCourse.setCourseName("CS4800");
        newCourse.setInstructorFirstName("Nima");
        newCourse.setInstructorLastName("Davarpanah");
        newCourse.setOfficeNum("3-2636");

        newCourse.print();
    }
}