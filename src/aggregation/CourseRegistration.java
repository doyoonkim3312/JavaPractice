package aggregation;

import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Instructor testInstructor = new Instructor("Doe", "John", "KNOY 101");
        TextBook testTextBook = new TextBook("Jump to Java", "Jane Doe", "Person");
        Course testCourse = new Course("Introduction of OOP using Java", testInstructor, testTextBook);

        System.out.println(testCourse.printCourseInfo());

    }
}
