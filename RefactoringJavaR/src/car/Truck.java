package car;


public class Truck extends Car {
    public Truck(int numberOfPassengers, double summerFuelConsumption, double winterFuelConsumption, double winterWarmingUp) {
        super(numberOfPassengers, summerFuelConsumption, winterFuelConsumption, winterWarmingUp);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
