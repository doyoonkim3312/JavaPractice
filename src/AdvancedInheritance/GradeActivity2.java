package AdvancedInheritance;
/*
    This class is a modification of GradeActivity class in Inheritance package. (Score field has been made protected.

    "protected": "protected" keyword is a type of access specification in Java. Protected is somewhere between private and public.
    Protected members of a class may be accessed by methods in a subclass and by methods in the same package as the class.
 */


public class GradeActivity2 {
    protected double score;

    //No-arg constructor for default value.
    public GradeActivity2() {
        score = 0.0;
    }

    public GradeActivity2(double score) {
        this.score = score;
    }

    public GradeActivity2(GradeActivity2 targetInstance) {
        this.score = targetInstance.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        if(this.score >= 90) {
            return 'A';
        } else if (this.score >= 80) {
            return 'B';
        } else if (this.score >= 70) {
            return 'C';
        } else if (this.score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
