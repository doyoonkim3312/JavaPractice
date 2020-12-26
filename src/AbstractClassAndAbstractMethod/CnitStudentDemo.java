package AbstractClassAndAbstractMethod;

import javax.swing.JOptionPane;

public class CnitStudentDemo {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter the First Name");
        String lastName = JOptionPane.showInputDialog("Enter the Last Name");
        String classSpecification = JOptionPane.showInputDialog("Enter student's class");
        YearSpecification yearSpecification = getYearSpecification(
                JOptionPane.showInputDialog("Enter student's year.")
        );

        CnitStudent testStudent = new CnitStudent(firstName, lastName, classSpecification, yearSpecification);
        testStudent.setMathHours(12);
        testStudent.setCnitHours(20);
        testStudent.setGenEdHours(40);

        JOptionPane.showMessageDialog(null, testStudent.printDetailedStudentInfo());

        System.exit(0);
    }

    public static YearSpecification getYearSpecification(String year) {
        return switch (year.toLowerCase()) {
            case "freshman" -> YearSpecification.FRESHMAN;
            case "sophomore" -> YearSpecification.SOPHOMORE;
            case "junior" -> YearSpecification.JUNIOR;
            case "senior" -> YearSpecification.SENIOR;
            default -> YearSpecification.UNIDENTIFIED;
        };
    }
}
