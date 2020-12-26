package Interface;

import Inheritance.GradeActivity;

public class FinalExam3 extends GradeActivity implements Relatable {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam3() {
        super();
        numQuestions = 0;
        pointsEach = 0.0;
        numMissed = 0;
    }

    public FinalExam3(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100.0 / numQuestions;
        super.setScore(100.0 - (pointsEach * numMissed));
    }

    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }



    @Override
    public boolean equals(GradeActivity gradeActivity) {
        if (this.getScore() == gradeActivity.getScore()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(GradeActivity gradeActivity) {
        if (this.getScore() > gradeActivity.getScore()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(GradeActivity gradeActivity) {
        if (this.getScore() < gradeActivity.getScore()) {
            return true;
        } else {
            return false;
        }
    }
}
