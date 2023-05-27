package car;

public class Sedan extends Car {
    public Sedan(int numberOfPassengers, double summerFuelConsumption, double winterFuelConsumption, double winterWarmingUp) {
        super(numberOfPassengers, summerFuelConsumption, winterFuelConsumption, winterWarmingUp);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
