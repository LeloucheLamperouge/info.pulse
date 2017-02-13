package lesson3.factory;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Car {

    private String carName;
    private String carcase;
    private String paint;

    private int wheels;
    private int seats;


    public Car(CarBuilder builder) {
        this.carName = builder.name;
        this.carcase = builder.carcase;
        this.paint = builder.paint;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
    }

    public static class CarBuilder {
        private String name;
        private String carcase;
        private String paint;

        private int wheels;
        private int seats;

        public CarBuilder(String name) {
            this.name = name;
        }

        public CarBuilder setCarcase(String carcase) {
            this.carcase = carcase;
            return this;
        }

        public CarBuilder setPaint(String paint) {
            this.paint = paint;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            if (wheels < 4) {
                System.out.println("бида");
            } else {
                this.wheels = wheels;
            }
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {

            return new Car(this);
        }

        public String getName() {
            return name;
        }

        public String getCarcase() {
            return carcase;
        }

        public String getPaint() {
            return paint;
        }

        public int getWheels() {
            return wheels;
        }

        public int getSeats() {
            return seats;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carcase='" + carcase + '\'' +
                ", paint='" + paint + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                '}';
    }
}
