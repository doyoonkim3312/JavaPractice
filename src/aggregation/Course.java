package aggregation;

public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    //Constructor
    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;

        /*
        Performing 'Deep Copy' for preventing security hole. Shallow copy might create security hole.
        Security hole: Security hole allows code outside the class to modify a private values of class (Field value)
         */
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    //Copy Constructor
    public Course(Course targetInstance) {
        this.courseName = targetInstance.courseName;
        this.instructor = new Instructor(targetInstance.instructor);
        this.textBook = new TextBook(targetInstance.textBook);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        //return instructor;    //This line might cause security hole.
        return new Instructor(this.instructor);
    }

    public TextBook getTextBook() {
        return new TextBook(this.textBook);
    }

    public String printCourseInfo() {
        return "Course Name: " + courseName + "\n" +
                "Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + "\n" +
                "Office: " + instructor.getOfficeNumber() + "\n" +
                "Text Book Info: " + textBook.getTitle() + " by " + textBook.getAuthor() +
                " published by " + textBook.getPublisher();
    }
}
