/*
Protected keyword is a modifier that consider a chance that value or method's change when the child class overrides it.
Protected keyword and Public keyword look almost the same but quite different.
    Public: "You can use this right now without editing.
    Protected: "You can use this, but you need to finish this value or method before use it. This might not ready to use or
                you might have to adjust this value or method for your own purpose of using.
 */

public class Person {
    // Static Field (Value) belongs to Class, rather than instance of class. That means, all instances of class shares
    // one static field (value);
    protected static int userConnectingCount = 0;
    int userId;
    String name;
    int age;
    String gender;
    String job;

    //Constructor
    public Person(String newName, int newAge, String newGender, String newJob) {
        userConnectingCount++;

        userId = userConnectingCount;
        name = newName;
        age = newAge;
        gender = newGender;
        job = newJob;

    }

    public void getUserId() {
        System.out.println("User ID: " + userId);
    }

    public void getAge() {
        System.out.println("User " + name + " is age of " + age);
    }

    public void getGender() {
        System.out.println("User " + name + "is " + gender);
    }

    public void getJob() {
        System.out.println("User " + name + " do " + job + " for living");
    }

    public void getConnectionCount() {
        System.out.println("Welcome! Your " + userConnectingCount + " visit!");
    }

    public void setName(String usrName) {
        name = usrName;
    }

    public void setAge(int usrAge) {
        age = usrAge;
    }

    public void setGender(String usrGender) {
        gender = usrGender;
    }

    public void setJob(String usrJob) {
        job = usrJob;
    }
}
