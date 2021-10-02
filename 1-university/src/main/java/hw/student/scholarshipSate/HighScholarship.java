package hw.student.scholarshipSate;

public class HighScholarship extends Scholarship {

    public HighScholarship(double scholarship) {
        if (scholarship<1890 || scholarship>1890) scholarship=1890;
        super.setScholarship(scholarship);
    }
}
