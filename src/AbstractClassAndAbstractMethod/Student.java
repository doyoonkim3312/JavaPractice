package AbstractClassAndAbstractMethod;
/*
    Abstract Class and Abstract Method: An Abstract Class is not instantiated, but other classes extend it. An Abstract
    method has no body and must be overridden in a subclass.
        When class contains an Abstract method, its instance cannot be created. Also, Abstract class is not instantiated
        itself, but serve as a Superclass for other classes.
 */
public abstract class Student {
    private String firstName;
    private String lastName;
    private String classSpecification;
    private YearSpecification yearSpecification;
    private String idNumber;

    public Student() {
        firstName = "";
        lastName = "";
        classSpecification = "";
        yearSpecification = YearSpecification.UNIDENTIFIED;
        idNumber = "";
    }

    public Student(String firstName, String lastName, String classSpecification, YearSpecification yearSpecification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classSpecification = classSpecification;
        this.yearSpecification = yearSpecification;
        idNumber = generateIdNumber();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setClassSpecification(String classSpecification) {
        this.classSpecification = classSpecification;
    }

    public void setYearSpecification(YearSpecification yearSpecification) {
        this.yearSpecification = yearSpecification;
    }

    public String printStudentInfo() {
        return "STUDENT INFO\n" +
                "FIRST NAME: " + firstName + "\n" +
                "LAST NAME: " + lastName + "\n" +
                "CLASS: " + classSpecification + "\n" +
                "YEAR: " + yearSpecification.toString() + "\n" +
                "ID NUMBER: " + idNumber + "\n" +
                "================================\n" +
                "REMAINING HOURS: " + getRemainingHours();

        //In enum class, toString method is already overridden and it returns name of enum variable.
    }

    public abstract int getRemainingHours();

    public static String generateIdNumber() {
        String numberGenerated = Double.toString(Math.random()); //Generate random number between 0.0 - 0.1
        String[] numberStoredArray = numberGenerated.split("");
        String idGenerated = "";

        try {
            for (int i = 2; i < 12; i++) {
                if (i == 7) {
                    idGenerated += "-" + numberStoredArray[i];
                } else {
                    idGenerated += numberStoredArray[i];
                }
            }
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }

        return idGenerated;
    }
}
