package lesson3.factory;

import lesson2.*;
import lesson2.Worker;

/**
 * Created by Lelouch on 22.02.2017.
 */
public class Test {
    public static void main(String[] args) {

        Junior junior = new Junior("Donatello");
        Senior senior = new Senior("Michelangelo");
        Master master = new Master("Leonardo");
        TeamLead teamLead = new TeamLead("Splinter");

        Car.CarBuilder carBuilder;
        Conveyer[] workers = new Conveyer[]{junior,senior,master};

        for (int i = 0; i < 6; i++) {
            carBuilder = new Car.CarBuilder("Car " + i);
            for (Conveyer works : workers){
                works.conv(carBuilder);
            }
            Car car = teamLead.newCar(carBuilder);
            System.out.println(car);
        }
    }
}
