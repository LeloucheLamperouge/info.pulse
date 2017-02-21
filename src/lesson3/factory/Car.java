package lesson3.factory;

import java.util.Arrays;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Car {

    private final String carName;
    private final String carcase;
    private final String[] wheels;
    private final String[] doors;
    private final String[] seats;
    public final String steerage;
    public final String carColor;
    public final boolean isReady;

    public static class CarBuilder {
        private final String carName;
        private final String carcase;
        private String[] wheels;
        private String[] doors;
        private String[] seats;
        public  String steerage;
        public  String carColor;
        public  boolean isReady;


        public CarBuilder(String carName, String carcase) {
            this.carName = carName;
            this.carcase = carcase;
        }
        public CarBuilder setWheels(String...wheels){
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setDoors(String... doors){
            this.doors = doors;
            return this;
        }
        public CarBuilder setSeats(String... seats){
            this.seats = seats;
            return  this;
        }
        public CarBuilder setSteerage(String steerage){
            this.steerage = steerage;
            return this;
        }
        public CarBuilder setCarColor(String carColor){
            this.carColor = carColor;
            return this;
        }
        public CarBuilder setIsReady(boolean isReady){
            this.isReady = isReady;
            return this;
        }
        public boolean isReady(){
            if ((carName != null) && (carcase != null) && (wheels != null) && (doors != null)
                && (seats != null) && (steerage != null) && (carColor != null))
                return true;
            else
                return false;
        }
        public Car build(){
            return (isReady())? new Car(this): null;
        }
    }
    public Car(CarBuilder carBuilder){
        this.carName = carBuilder.carName;
        this.carcase = carBuilder.carcase;
        this.wheels = carBuilder.wheels;
        this.doors = carBuilder.doors;
        this.seats = carBuilder.seats;
        this.steerage = carBuilder.steerage;
        this.carColor = carBuilder.carColor;
        this.isReady = carBuilder.isReady;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarcase() {
        return carcase;
    }

    public String[] getWheels() {
        return wheels;
    }

    public String[] getDoors() {
        return doors;
    }

    public String[] getSeats() {
        return seats;
    }

    public String getSteerage() {
        return steerage;
    }

    public String getCarColor() {
        return carColor;
    }

    public boolean isReady() {
        return isReady;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carcase='" + carcase + '\'' +
                ", wheels=" + Arrays.toString(wheels) +
                ", doors=" + Arrays.toString(doors) +
                ", seats=" + Arrays.toString(seats) +
                ", steerage='" + steerage + '\'' +
                ", carColor='" + carColor + '\'' +
                ", isReady=" + isReady +
                '}';
    }
}
