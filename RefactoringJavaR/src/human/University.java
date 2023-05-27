package human;

import java.util.ArrayList;
import java.util.List;

public class University extends Student {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student selectedStudent = null;
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                selectedStudent = student;
                break;
            }
        }
        return selectedStudent;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student maxGradeStudent = null;
        double maxGrade = 0.0;

        for (Student student : students) {
            if (student.getAverageGrade() > maxGrade) {
                maxGrade = student.getAverageGrade();
                maxGradeStudent = student;
            }
        }

        return maxGradeStudent;
    }

    public Student getStudentWithMinAverageGrade() {
        Student minGradeStudent = null;
        double minGrade = Double.MAX_VALUE;

        for (Student student : students) {
            if (student.getAverageGrade() < minGrade) {
                minGrade = student.getAverageGrade();
                minGradeStudent = student;
            }
        }

        return minGradeStudent;
    }

    public void expel(Student student) {
        students.remove(student);
    }


}