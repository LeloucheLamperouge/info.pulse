package lesson3.factory;


/**
 * Created by Lelouch on 11.02.2017.
 */
public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("Vasya","start");
        Worker worker1 = new Worker("Petya","paint");

        Car.CarBuilder zagotovka = worker.make();



        worker.makePaint(zagotovka.setPaint("red"));
        worker.makeCarcase(zagotovka.setCarcase("huita"));
        worker.makeWheels(zagotovka.setWheels(4));
        worker.makeSeats(zagotovka.setSeats(5));

        Car car = zagotovka.build();

        System.out.println(car);
    }
}
