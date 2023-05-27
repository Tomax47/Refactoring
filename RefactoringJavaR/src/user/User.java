package user;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean man;

    private String country;
    private String city;
    private House house;

    private Work work;

    private Address address;



    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {
        return man;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        printAdditionalInfo();
    }

    public void printAdditionalInfo() {
        if (age < 16)
            System.out.println("Пользователь моложе 16 лет");
        else
            System.out.println("Пользователь старше 16 лет");
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public String getBoss() {
        if (work != null) {
            return work.getBoss();
        }
        return null;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}