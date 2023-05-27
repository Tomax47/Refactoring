package human;

public class Human {
    public static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    protected int course;

    private BloodGroup bloodGroup;


    public class Size {
        public int height;
        public int weight;
    }
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(int height, int weight) {
        Size newSize = new Size();
        newSize.height = height;
        newSize.weight = weight;
        this.size = newSize;
    }

    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;
//    private int bloodGroup;

    public Human(boolean b) {
    }

    public Human() {
    }

//    public void setBloodGroup(int code) {
//        bloodGroup = code;
//    }
//
//    public int getBloodGroup() {
//        return bloodGroup;
//    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void live() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }
}