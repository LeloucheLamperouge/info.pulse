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

        /*driver.driverExpUpDown();
        driver1.driverExpUpDown();
        driver2.driverExpUpDown();*/

        Comparator<Driver> driverComparator = new Comparator<Driver>() {
            @Override
            public int compare(Driver o1, Driver o2) {
                if (o1.getDriverExp() < o2.getDriverExp()) {
                    return 1;
                }
                else {return -1;}
                /*return 0;*/
            }
        };

        Queue<Driver> driverQueue = new PriorityQueue<>(driverComparator);
        driverQueue.add(driver);
        driverQueue.add(driver1);
        driverQueue.add(driver2);

        System.out.println(driverQueue.toString());

        for (Train t: trains
               ) {
           Driver drivers = driverQueue.poll();
           driver.driverExpUpDown();
           driver1.driverExpUpDown();
           driver2.driverExpUpDown();
           driverQueue.add(drivers);
        }{
            System.out.println(driverQueue.toString());
        }

        Line line = new Line(1,"Red");
        Line line1 = new Line(2,"Blue");
        Line line2 = new Line(3,"Green");


        for (int i = 0; i < 10 ; i++) {
            
            line.addStation(new Station(i));
            line1.addStation(new Station(i));
            line2.addStation(new Station(i));
        }
        System.out.println(line);
        System.out.println(line1);
        System.out.println(line2);

        Iterator<Train> trainIterator = trains.iterator();
        while (trainIterator.hasNext()){
           line.addTrain(trainIterator.next());
           if (trainIterator.hasNext()){
           line1.addTrain(trainIterator.next());
           }
           if (trainIterator.hasNext()){
           line2.addTrain(trainIterator.next());
           }

        }
        System.out.println(line);
        System.out.println(line1);
        System.out.println(line2);


    }
}





