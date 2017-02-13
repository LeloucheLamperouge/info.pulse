package lesson3.factory;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Car {

    private String carName;
    private String kuzov;
    private String paint;

    private int wheels;
    private int seats;


    public Car(CarBuilder builder){
        this.carName = builder.name;
        this.kuzov = builder.kuzov;
        this.paint = builder.paint;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
    }

    public static class CarBuilder{
        private String name;
        private String kuzov;
        private String paint;

        private int wheels;
        private int seats;

        public CarBuilder(String name){
            this.name = name;
        }
        public CarBuilder setKuzov(String kuzov){
            this.kuzov = kuzov;
            return this;
        }
        public CarBuilder setPaint(String paint){
            this.paint = paint;
            return this;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }
        public Car build(){
            return new Car (this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", kuzov='" + kuzov + '\'' +
                ", paint='" + paint + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                '}';
    }
}
