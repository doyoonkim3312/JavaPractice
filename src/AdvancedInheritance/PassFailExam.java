package AdvancedInheritance;

public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam() {
        super();
        numQuestions = 0;
        pointsEach = 0;
        numMissed = 0;
    }

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        pointsEach = 100.0 / numQuestions;
        this.numMissed = numMissed;
        super.setScore(100.0 - (numMissed * pointsEach));
        //System.out.println(super.getGrade());
    }

    public PassFailExam(PassFailExam targetInstance) {
        super(targetInstance.getMinPassingScore());
        this.numQuestions = targetInstance.numQuestions;
        this.pointsEach = targetInstance.pointsEach;
        this.numMissed = targetInstance.numMissed;
        super.setScore(targetInstance.getScore());
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
