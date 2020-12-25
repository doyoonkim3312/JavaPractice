package AdvancedInheritance;
/*
    This class is a modification of FinalExam class in Inheritance package. This class corresponds to GradeActivity2 class.
 */

public class FinalExam2 extends GradeActivity2 {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    //No-arg constructor for default value.
    public FinalExam2() {
        numQuestions = 0;
        pointsEach = 0.0;
        numMissed = 0;
        score = 0.0;    // Score is a protected member of GradeActivity2, so FinalExam2 can directly access to score.
    }

    public FinalExam2(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100.0 / numQuestions;
        this.adjustScore(100.0 - (numMissed * pointsEach));

    }

    public FinalExam2(FinalExam2 targetInstance) {
        this.numQuestions = targetInstance.numQuestions;
        this.numMissed = targetInstance.numMissed;
        this.pointsEach = targetInstance.pointsEach;
        this.score = targetInstance.score;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public void setNumMissed(int numMissed) {
        this.numMissed = numMissed;
    }

    public void adjustScore(double score) {
        double fractionalPart = score - (int) score;

        if (fractionalPart >= 0.5) {
            this.score = score + (1.0 - fractionalPart);
        }
    }

    public String printFinalExamInfo() {
        return "FINAL EXAM INFO\n" +
                "TOTAL NUMBER OF QUESTIONS: " + numQuestions + "\n" +
                "NUMBER OF QUESTIONS MISSED: " + numMissed + "\n" +
                "POINT PER EACH: " + pointsEach + "\n" +
                "ADJUSTED SCORE: " + score + "\n" +
                "LETTER GRADE: " + this.getGrade();
    }
}
