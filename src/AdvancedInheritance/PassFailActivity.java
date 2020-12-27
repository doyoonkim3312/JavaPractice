package AdvancedInheritance;

import Inheritance.GradeActivity;

/**
 * Extend of GradeActivity for handling P/F option
 * @author Doyoon Kim
 */

public class PassFailActivity extends GradeActivity {
    private double minPassingScore;

    /**
     * No-arg constructor for default value.
     */

    public PassFailActivity() {
        super();
        minPassingScore = 0.0;
    }

    /**
     * Recommended Constructor
     * @param minPassingScore Minimum Passing score for P/F option.
     *
     */
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    /**
     * Constructor that copies exist PassFailActivity Object.
     * @param targetInstance Exist PassFailActivity Object.
     */

    public PassFailActivity(PassFailActivity targetInstance) {
        super(targetInstance.getScore());
        this.minPassingScore = targetInstance.minPassingScore;
    }

    /**
     * Calculate P/F option based on minPassingScore.
     * @return Letter Grade corresponding to P/F option.
     */
    public char getGrade() {
        System.out.println("Overridden method is called");
        if (super.getScore() >= minPassingScore) {
            return 'P';
        } else {
            return 'F';
        }
    }

    /**
     * Get Minimum Passing Score
     * @return Minimum Passing Score
     */
    public double getMinPassingScore() {
        return minPassingScore;
    }

}
