package hw.student.scholarshipSate;

public abstract class Scholarship {
    private double scholarship;

    public Scholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    protected Scholarship() {
    }

    protected void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }
}
