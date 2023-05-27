package car;


import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    public static final int MAX_TRUCK_SPEED = 80;
    public static final int MAX_SEDAN_SPEED = 120;
    public static final int MAX_CABRIOLET_SPEED = 90;


    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;


    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int numberOfPassengers, double summerFuelConsumption, double winterFuelConsumption, double winterWarmingUp) {
        this.numberOfPassengers = numberOfPassengers;
        this.winterFuelConsumption = winterFuelConsumption;
        this.winterWarmingUp = winterWarmingUp;
        this.summerFuelConsumption = summerFuelConsumption;
    }




    public static Car create(int type, int numberOfPassengers) {
        switch (type) {
            case TRUCK:
                return new Truck(numberOfPassengers, 0, 0, 0);
            case SEDAN:
                return new Sedan(numberOfPassengers, 0, 0, 0);
            case CABRIOLET:
                return new Cabriolet(numberOfPassengers, 0, 0, 0);
            default:
                throw new IllegalArgumentException("Invalid car type: " + type);
        }
    }



    public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
        return !date.before(summerStart) && !date.after(summerEnd);
    }

    public double getWinterConsumption(int length) {
        return length * winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length) {
        return length * summerFuelConsumption;
    }


    public int fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0)
            throw new Exception("Invalid number of liters: " + numberOfLiters);
        fuel += numberOfLiters;
        return 0;
    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
        if (isSummer(date, summerStart, summerEnd)) {
            return getSummerConsumption(length);
        } else {
            return getWinterConsumption(length);
        }
    }

    public int getNumberOfPassengersCanBeTransferred() {
        return canPassengersBeTransferred() ? numberOfPassengers : 0;
    }


    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        fastenDriverBelt();
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
    }


    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

//    public int getMaxSpeed() {
//        if (type == TRUCK)
//            return MAX_TRUCK_SPEED;
//        if (type == SEDAN)
//            return MAX_SEDAN_SPEED;
//        return MAX_CABRIOLET_SPEED;
//    }

    public abstract int getMaxSpeed();



    public boolean isThereFuel(){
        return fuel > 0;
    }

    public boolean canPassengersBeTransferred() {
        return isDriverAvailable() && isThereFuel();
    }
}