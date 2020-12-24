package Inheritance;

public class FinalExam extends GradeActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    //Constructor
    public FinalExam() {
        numQuestions = 0;
        pointsEach = 0.0;
        numMissed = 0;

        setScore(0.0);
    }

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100.0 / numQuestions;

        super.setScore(100.0 - (numMissed * pointsEach)); //method inherited from GradeActivity class
        /*
        super keyword refers object's superclass. In the code above, super keyword does not actually necessary, but,
        using super keyword, programmer can give more clear statement that setScores method is a public member of superclass.
         */

    }

    public FinalExam(FinalExam targetInstance) {
        this.numQuestions = targetInstance.numQuestions;
        this.numMissed = targetInstance.numMissed;
        this.pointsEach = targetInstance.pointsEach;

        setScore(100.0 - (this.numMissed * this.pointsEach));
    }

    public Double getPointsEach() {
        return pointsEach;
    }

    public Integer getNumMissed() {
        return numMissed;
    }

    public String printExamInfo() {
        return "FINAL EXAM INFO\n" +
                "TOTAL QUESTION: " + numQuestions + "\n" +
                "QUESTION MISSED: " + numMissed + "\n" +
                "POINT PER QUESTION: " + pointsEach + "\n" +
                "NUMERIC SCORE: " + this.getScore() + "\n" +
                "LETTER GRADE: " + this.getGrade();
    }

}
