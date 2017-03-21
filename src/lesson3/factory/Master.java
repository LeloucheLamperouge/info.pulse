package lesson3.factory;

/**
 * Created by Lelouch on 22.02.2017.
 */
public class Master extends Worker implements Conveyer {
    String name;
    public Master(String name){
        super(name);
    }
    @Override
    public Car.CarBuilder conv(Car.CarBuilder carBuilder) {
        String steerage;
        if (Math.random() >= 0.5){
            steerage = "powered";
        }else {
            steerage = "normal";
        }
        carBuilder.setSteerage(steerage).setIsReady(true);
        return carBuilder;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                '}';
    }
}
