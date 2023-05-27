package car;

public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers, double summerFuelConsumption, double winterFuelConsumption, double winterWarmingUp) {
        super(numberOfPassengers, summerFuelConsumption, winterFuelConsumption, winterWarmingUp);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
