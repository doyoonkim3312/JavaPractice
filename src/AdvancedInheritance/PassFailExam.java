package AdvancedInheritance;

/**
 * Create Pass/Fail version of Exam (Extends PassFailActivity)
 * @author Doyoon Kim
 * @version 1.0
 */

public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    /**
     * No-arg constructor for default value.
     */
    public PassFailExam() {
        super();
        numQuestions = 0;
        pointsEach = 0;
        numMissed = 0;
    }

    /**
     * Recommended Constructor
     *
     * @param numQuestions Number of questions on Exam
     * @param numMissed Number of questions student missed.
     * @param minPassingScore Minimum Passing score for P/F option
     */
    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        pointsEach = 100.0 / numQuestions;
        this.numMissed = numMissed;
        super.setScore(100.0 - (numMissed * pointsEach));
        //System.out.println(super.getGrade());
    }

    /**
     * Constructor that copy exist PassFailExam object.
     *
     * @param targetInstance Exist PassFailExam Object.
     */
    public PassFailExam(PassFailExam targetInstance) {
        super(targetInstance.getMinPassingScore());
        this.numQuestions = targetInstance.numQuestions;
        this.pointsEach = targetInstance.pointsEach;
        this.numMissed = targetInstance.numMissed;
        super.setScore(targetInstance.getScore());
    }

    /**
     *
     * @return Points per Each question.
     */
    public double getPointsEach() {
        return pointsEach;
    }

    /**
     *
     * @return Number of question student missed.
     */
    public int getNumMissed() {
        return numMissed;
    }


    public String toString() {
        //Overridden toString method.
        System.out.println("Overridden toString method is called");
        return Integer.toHexString(hashCode());
    }
}
