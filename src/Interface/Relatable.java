package Interface;

import Inheritance.GradeActivity;
/*
    It is recommended that the name of Interface should imply a intent of that interface.
    In interface named 'Relatable', all methods in this interface should perform relational comparisons.
 */
public interface Relatable {
    String field = "This is a field belonged to interface.";
    // Since all fields in Interface are treated as 'static final', those fields have to be initialized.

    boolean equals(GradeActivity gradeActivity);
    boolean isGreaterThan(GradeActivity gradeActivity);
    boolean isLessThan(GradeActivity gradeActivity);
}
