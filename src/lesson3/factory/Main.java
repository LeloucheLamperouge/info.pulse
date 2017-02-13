package lesson3.factory;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Vasya","навсеруки");
        Car.CarBuilder zagotovka = worker.make();
        worker.makePaint(zagotovka);
        worker.makeKuzov(zagotovka);


        Car car = zagotovka.build();
        System.out.println(car);


    }
}
