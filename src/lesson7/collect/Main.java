package lesson7.collect;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * Created by Lelouch on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Carriage> depot = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Carriage carriage = new Carriage(i, (i % 3 == 0) ? Carriage.TypeOfCarriage.HEAD : Carriage.TypeOfCarriage.PASSENGER);
            depot.add(carriage);
        }
        System.out.println(depot);

        List<Train> trains = new ArrayList<>();

        Train train = new Train(0);


        Iterator<Carriage> carriageIterator = depot.iterator();
        while (carriageIterator.hasNext()) {
            if (train.carriageList.size() < 5) {
                train.addCarriage(carriageIterator.next());
            } else {
                trains.add(train);
                train = new Train(1);
            }


        }
        System.out.println(trains);

        Driver driver = new Driver(1, "Ezio");
        Driver driver1 = new Driver(2, "Shay");
        Driver driver2 = new Driver(3, "Altair");

        Iterator<Train> trainIterator = trains.iterator();
        {
            while (trainIterator.hasNext()) {
                driver.addDriver(train);

            }
        }
    }
}





