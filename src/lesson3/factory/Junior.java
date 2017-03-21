package lesson3.factory;

/**
 * Created by Lelouch on 22.02.2017.
 */
public class Junior extends Worker implements Conveyer {

    String name;

    public Junior(String name) {
        super(name);
    }

    @Override
    public Car.CarBuilder conv(Car.CarBuilder carBuilder) {
        carBuilder.setCarcase(carType.values()[(int) Math.random() * 4].toString()).setCarColor
                (carColor.values()[(int) Math.random() * 3].toString());
        return carBuilder;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "name='" + name + '\'' +
                '}';
    }
}
