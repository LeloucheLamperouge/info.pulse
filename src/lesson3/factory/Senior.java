package lesson3.factory;

/**
 * Created by Lelouch on 22.02.2017.
 */
public class Senior extends Worker implements Conveyer {
    String name;
    public Senior(String name){
        super(name);
    }
    @Override
    public Car.CarBuilder conv(Car.CarBuilder carBuilder) {
        String[] wheels;
        String[] doors;
        String[] seats;
        wheels = new String[]{"front Left","front Right","back Left","back Right"};
        doors = new String[]{"front Left","front Right","back Left","back Right"};
        seats = new String[]{"driver","passenger","back"};
        carBuilder.setWheels(wheels).setDoors(doors).setSeats(seats);
        return carBuilder;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + name + '\'' +
                '}';
    }
}
