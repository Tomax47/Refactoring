package human;

public class BloodGroup {
    public static final BloodGroup FIRST = new BloodGroup(1);
    public static final BloodGroup SECOND = new BloodGroup(2);
    public static final BloodGroup THIRD = new BloodGroup(3);
    public static final BloodGroup FOURTH = new BloodGroup(4);

    private int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BloodGroup first() {
        return FIRST;
    }

    public static BloodGroup second() {
        return SECOND;
    }

    public static BloodGroup third() {
        return THIRD;
    }

    public static BloodGroup fourth() {
        return FOURTH;
    }

}
