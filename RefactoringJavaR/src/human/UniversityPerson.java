package human;

public class UniversityPerson {
    private University university;

    public UniversityPerson(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "UniversityPerson{" +
                "university=" + university +
                '}';
    }
}
