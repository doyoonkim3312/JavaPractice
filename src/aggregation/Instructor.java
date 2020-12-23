package aggregation;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    /*
    'this' keyword: 'this' keyword is the name of a reference variable that an object can use to refer to itself.
    It is available to all non-static methods.
     */

    //Constructor
    public Instructor(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    //Copy Constructor
    public Instructor(Instructor targetInstance) {
        this.lastName = targetInstance.lastName;
        this.firstName = targetInstance.firstName;
        this.officeNumber = targetInstance.officeNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }



}
