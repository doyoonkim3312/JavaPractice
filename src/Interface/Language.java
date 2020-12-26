package Interface;
/*
    Interface is like a "Contract". When class implements Interface, class is potentially agreeing to provide all of
    the methods that are specified by the Interface.
 */

public class Language implements Displayable {
    private String languageName;

    public Language() {
        languageName = "";
    }

    public Language(String languageName) {
        this.languageName = languageName;
    }


    public void Display() {
        System.out.println("Hello, " + languageName + "!");
    }

    public String returnString() {
        return "Hello, " + languageName + "!";
    }

    // Default method can be overridden.
    /*
    public void display() {
        System.out.println("Overridden Default Method is called");
    }
     */
}
