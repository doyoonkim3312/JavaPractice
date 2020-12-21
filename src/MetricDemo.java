import javax.swing.*;

public class MetricDemo {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a distance in Miles");
        double usrMile = Double.parseDouble(input);

        //Conversion
        double toKilometer = Metric.m2km(usrMile);
        JOptionPane.showMessageDialog(null, usrMile + " is same as " + toKilometer + " in Km");

        /*
        Basically, when static method is called on different class, declaring name of class where method belongs to.
        Ex): Metric.m2km(usrMile);
            Metric: Name of Class where method "usrMile" belongs to.
            m2km(usrMile): static method called.
         */
    }
}
