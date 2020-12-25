package AdvancedInheritance;

import Inheritance.GradeActivity;

public class PassFailActivity extends GradeActivity {
    private double minPassingScore;

    //No-arg constructor for default value.
    public PassFailActivity() {
        super();
        minPassingScore = 0.0;
    }

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    public PassFailActivity(PassFailActivity targetInstance) {
        super(targetInstance.getScore());
        this.minPassingScore = targetInstance.minPassingScore;
    }

    public char getGrade() {
        if (super.getScore() >= minPassingScore) {
            return 'P';
        } else {
            return 'F';
        }
    }

    public double getMinPassingScore() {
        return minPassingScore;
    }

}
