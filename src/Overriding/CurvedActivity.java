package Overriding;

import Inheritance.GradeActivity;
import org.jetbrains.annotations.NotNull;

public class CurvedActivity extends GradeActivity {
    private double rawScore;
    private double percentage;

    //No-arg constructor for default value.
    public CurvedActivity() {
        super();
        rawScore = 0.0;
        percentage = 0.0;
    }

    public CurvedActivity(double rawScore, double percentage) {
        super();    // this line is not necessary because java automatically call this line, but for practice, I intentionally remain this line.
        /*
        this.rawScore = rawScore;
        this.percentage = percentage * 0.01;

        super.setScore(rawScore * this.percentage);
         */
        this.rawScore = rawScore;
        this.percentage = percentage;

        this.setScore(rawScore);
    }


    public CurvedActivity(CurvedActivity targetInstance) {
        super();
        /*
        this.rawScore = targetInstance.rawScore;
        this.percentage = targetInstance.percentage;

        super.setScore(this.rawScore * this.percentage);
         */
        this.rawScore = targetInstance.rawScore;
        this.percentage = targetInstance.percentage;

        this.setScore(targetInstance.getRawScore());
    }

    @Override
    public void setScore(double score) {
        super.setScore(score * (1 + percentage * 0.01));
    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }


}
