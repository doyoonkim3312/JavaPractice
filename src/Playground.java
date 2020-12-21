import java.util.*;

public class Playground {
    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);
        System.out.println("Create New Person! Type name: ");
        String usrName = usrInput.nextLine();

        System.out.println("Type Age: ");
        int usrAge = Integer.parseInt(usrInput.nextLine());

        System.out.println("Type Gender: ");
        String usrGender = usrInput.nextLine();

        System.out.println("Type Job: ");
        String usrJob = usrInput.nextLine();
        usrInput.close();

        //Creating new instance of Person.
        Person createdPerson = new Person(usrName, usrAge, usrGender, usrJob);
        // userConnectingCount = 1
        Person secondCreatedPerson = new Person("John Doe", 26, "Male", "None");
        // userConnectingCount = 2

        createdPerson.getUserId();
        createdPerson.getAge();
        createdPerson.getGender();
        createdPerson.getJob();

        createdPerson.setAge(22);
        createdPerson.getAge();

        secondCreatedPerson.getUserId();

    }
}
