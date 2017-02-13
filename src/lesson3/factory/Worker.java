package lesson3.factory;

import java.util.concurrent.Callable;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Worker {

    private String name;
    private String skill;

    public Worker(){

    }

    public Worker(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

   public Car.CarBuilder make(){
        Car.CarBuilder car = new Car.CarBuilder("Йа машинко");
        return car;
   }
   public Car.CarBuilder makeKuzov(Car.CarBuilder make){
    make.setKuzov("Jeep");
    return make;
   }
   public Car.CarBuilder makePaint(Car.CarBuilder make){
       make.setPaint("red");
       return make;
   }
   public Car.CarBuilder makeWheels(Car.CarBuilder make){
       make.setWheels(4);
       return make;
   }
   public Car.CarBuilder makeSeats(Car.CarBuilder make){
       make.setSeats(5);
       return make;
   }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
