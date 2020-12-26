package Inheritance;

public class GradeActivity {
    private double score;

    //Constructor
    public GradeActivity() {
        score = 0.0;
    }

    public GradeActivity(double score) {
        this.score = score;
    }

    public GradeActivity(GradeActivity targetInstance) {
        this.score = targetInstance.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        System.out.println("Original method is called");
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
