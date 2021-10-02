package hw.student.scholarshipSate;

public class DefaultScholarship extends Scholarship {
    public DefaultScholarship(double scholarship) {
        if (scholarship>1200 || scholarship<1200) scholarship = 1200;
        super.setScholarship(scholarship);
    }
}
