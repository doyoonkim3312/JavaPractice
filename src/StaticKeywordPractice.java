public class StaticKeywordPractice {
    public static void main(String[] args) {

        int objCount;

        Countable instance1 = new Countable();
        creationAlert(instance1);

        Countable instance2 = new Countable();
        creationAlert(instance2);

        Countable instance3 = new Countable();
        creationAlert(instance3);

        objCount = instance1.getInstanceCount();
        System.out.println(objCount + " instances of the class have been created");

    }

    //Static method and passing object as an Argument.
    public static void creationAlert(Countable instance) {
        System.out.println("Instance Number: " + instance.getInstanceCount() + " is created");
    }
}
