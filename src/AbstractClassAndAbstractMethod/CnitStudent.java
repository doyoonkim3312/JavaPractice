package AbstractClassAndAbstractMethod;

public class CnitStudent extends Student {
    //Hours Required
    private final int MATH_HOURS = 20;
    private final int CNIT_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    //Hours Taken
    private int mathHours;
    private int cnitHours;
    private int genEdHours;

    public CnitStudent() {
        super();
        mathHours = 0;
        cnitHours = 0;
        genEdHours = 0;
    }

    public CnitStudent(String firstName, String lastName, String classSpecification, YearSpecification yearSpecification) {
        super(firstName, lastName, classSpecification, yearSpecification);
    }

    public void setMathHours(int mathHours) {
        this.mathHours = mathHours;
    }

    public void setCnitHours(int cnitHours) {
        this.cnitHours = cnitHours;
    }

    public void setGenEdHours(int genEdHours) {
        this.genEdHours = genEdHours;
    }

    public String printDetailedStudentInfo() {
        return super.printStudentInfo() + "\n" +
                "Major: BS-CNIT\n" +
                "Math Hour Taken: " + mathHours + "\n" +
                "CNIT Hour Taken: " + cnitHours + "\n" +
                "General Education Hour Taken: " + genEdHours + "\n";
    }

    @Override
    public int getRemainingHours() {
        int mathRemaining = MATH_HOURS - mathHours;
        int cnitRemaining = CNIT_HOURS - cnitHours;
        int genEdRemaining = GEN_ED_HOURS - genEdHours;

        return mathRemaining + cnitRemaining + genEdRemaining;
    }

}
