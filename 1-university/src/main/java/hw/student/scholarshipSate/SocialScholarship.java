package hw.student.scholarshipSate;

import java.util.Map;

public class SocialScholarship extends Scholarship{
    private final String categoryScholarship;

    public SocialScholarship(String scholarshipCategory,Map<String, Double> categoryScholarship) {
        super.setScholarship(categoryScholarship.get(scholarshipCategory));
        this.categoryScholarship = scholarshipCategory;
    }

    public String getCategoryScholarship() {
        return categoryScholarship;
    }
}
