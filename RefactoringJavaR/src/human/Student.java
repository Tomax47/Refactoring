package human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static human.StudentsDataBase.students;

public class Student extends Human implements Alive {
    private double averageGrade;
    private String university;
    private Date beginningOfSession;
    private Date endOfSession;
    private List<Human> children = new ArrayList<>();
    private int course;
    private int id;
    private static int nextId = 1;

    public Student(String name, int age, double averageGrade) {
        super(false);
        this.id = generateId();
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    private static int generateId() {
        return nextId++;
    }

    public Student() {
    }

    public void live() {
        learn();
    }

    public int getCourse() {
        return course;
    }

    public void learn() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Студент: " + name);
    }

//    public void incAverageGradeBy01() {
//        averageGrade += 0.1;
//    }
//
//    public void incAverageGradeBy02() {
//        averageGrade += 0.2;
//    }

//    public void incAverageGrade(double delta) {
//        averageGrade += delta;
//    }

    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }

//    public void setValue(String name, double value) {
//        if (name.equals("averageGrade")) {
//            averageGrade = value;
//            return;
//        }
//        if (name.equals("course")) {
//            course = (int) value;
//            return;
//        }
//    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

//    public void setBeginningOfSession(int day, int month, int year) {
//        beginningOfSession = new Date(year, month, day);
//    }
//
//    public void setEndOfSession(int day, int month, int year) {
//        endOfSession = new Date(year, month, day);
//    }

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    @Override
    public String getPosition() {
        return "Студент";
    }

    public static void addInfoAboutStudent(Student student) {
        students.add(student);
        printInfoAboutStudent(student);
    }

    public static void printInfoAboutStudent(Student student) {
        System.out.println("Имя: " + student.getName() + " Возраст: " + student.getAge());
    }

    public static void removeStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    public static void findDimaOrSasha() {
        for (Student student : students) {
            if (student.getName().equals("Dima")) {
                System.out.println("Студент Dima есть в базе.");
                break;
            }

            if (student.getName().equals("Sasha")) {
                System.out.println("Студент Sasha есть в базе.");
                break;
            }
        }
    }


}