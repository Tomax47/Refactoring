package car;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Car sedan = new Sedan(4,15.7,23.2,9.0);
        sedan.fill(15);
        sedan.setDriverAvailable(true);
        System.out.println(sedan.getNumberOfPassengersCanBeTransferred());
        System.out.println(sedan.canPassengersBeTransferred());

        Date today = new Date(2023-5-5);
        Date starterPoint = new Date(2023-5-23);
        Date endPoint = new Date(2023-6-5);
        System.out.println("Consumption : "+sedan.getTripConsumption(today,500,starterPoint,endPoint));
    }
}
