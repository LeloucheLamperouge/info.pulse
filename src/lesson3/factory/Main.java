package lesson3.factory;


import lesson3.factory.Car.CarBuilder;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("Vasya", "start");
        Worker worker1 = new Worker("Petya", "paint");
        Worker worker2 = new Worker("Stepan", "carcase");
        Worker worker3 = new Worker("Fedor", "wheels");
        Worker worker4 = new Worker("Said", "seats");
        Car.CarBuilder zagotovka = new Car.CarBuilder();


    }

}
