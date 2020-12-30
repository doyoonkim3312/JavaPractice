package ExceptionHandling;

/*
    Throwing Exception: Codes that throws one of the Standard Java exceptions or instance of a custom designed exception
                        class can be written.

                        Statement Format: throw new ExceptionType(MessageString)
                        throw keyword causes an exception object to be created and thrown. throw keyword is different
                        from throws keyword.
 */

import java.util.Random;

public class Die {
    private final int MIN_SIDES = 4;
    private int numSides;
    private int dieValue;

    public Die(int numSides) {
        if (numSides < MIN_SIDES) {
            throw new IllegalArgumentException("The die must have at least " + MIN_SIDES + " sides");
        }
        this.numSides = numSides;
        roll();
    }

    public void roll() {
        Random rollingDie = new Random();
        dieValue = rollingDie.nextInt(numSides) + 1;   // get random integer in range of 0 to MIN_SIDES - 1)
    }

    public int getDieValue() {
        return dieValue;
    }

    public int getNumSides() {
        return numSides;
    }
}
