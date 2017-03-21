package lesson3.factory;

/**
 * Created by Lelouch on 22.02.2017.
 */
public class TeamLead extends Worker {

    String name;

    public TeamLead(String name) {
        super(name);
    }

    public Car newCar(Car.CarBuilder carBuilder) {
        Car car = carBuilder.build();
        if (car == null) {
            System.out.println("Car is not ready!!!");
        }
        return car;
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "name='" + name + '\'' +
                '}';
    }
}
