package lesson3.factory;


/**
 * Created by Lelouch on 11.02.2017.
 */
public class Worker {

    protected String name;
    protected String skill;

    public Worker() {

    }

    public Worker(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

     public Car.CarBuilder start(Car.CarBuilder carName) {
            if (skill.equals("start")) {
                Car.CarBuilder carBuilder = new Car.CarBuilder();
                carBuilder.getName();
            }
           return carName;

    }
        public Car.CarBuilder makeCarcase(Car.CarBuilder make) {
            make.getCarcase();
            return make;

        }

        public Car.CarBuilder makePaint(Car.CarBuilder make) {
            make.getPaint();
            return make;
        }

        public Car.CarBuilder makeWheels(Car.CarBuilder make) {
            make.getWheels();
            return make;
        }

        public Car.CarBuilder makeSeats(Car.CarBuilder make) {
            make.getSeats();
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
