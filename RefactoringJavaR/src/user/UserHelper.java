package user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {


    private User userAnya = new User("Аня", "Смирнова", 10);
    private User userRoma = new User("Рома", "Виноградов", 30);

    private boolean isManAnya = false;
    private boolean isManRoma = true;

    public void printUsers() {
        userAnya.printInfo();
        userRoma.printInfo();
    }

    private void printAdditionalInfo(User user) {
        if (user.getAge() < 16)
            System.out.println("Пользователь моложе 16 лет");
        else
            System.out.println("Пользователь старше 16 лет");
    }

    public void setManAnya(boolean manAnya) {
        userAnya.setMan(manAnya);
    }

    public boolean isManAnya() {
        return userAnya.isMan();
    }

    public void setManRoma(boolean manRoma) {
        userRoma.setMan(manRoma);
    }

    public boolean isManRoma() {
        return userRoma.isMan();
    }



    private boolean ageLessThan16(User user) {
        if (user.getAge() < 16) {
            return true;
        }
        return false;
    }

    public int calculateAverageAge() {
        User userUra = new User("Юра", "Карп", 28);

        return (userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3;
    }

//    public void calculateRate(AtomicInteger base, int age, boolean hasWork, boolean hasHouse) {
//        base.set(base.get() + age / 100);
//        base.set((int) (base.get() * (hasWork ? 1.1 : 0.9)));
//        base.set((int) (base.get() * (hasHouse ? 1.1 : 0.9)));
//    }

    public int calculateRate(AtomicInteger base, int age, boolean hasWork, boolean hasHouse) {
        int calculatedRate = base.get() + age / 100;
        calculatedRate = (int) (calculatedRate * (hasWork ? 1.1 : 0.9));
        calculatedRate = (int) (calculatedRate * (hasHouse ? 1.1 : 0.9));
        return calculatedRate;
    }

    public String getBossName(User user) {
        return user.getBoss();
    }
}