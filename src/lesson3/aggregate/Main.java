package lesson3.aggregate;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Worker jun = new Worker("Petya", "junior");
        Worker mid = new Worker("Vasya", "middle");
        Worker sen = new Worker("Semen", "senior");

        Aggregate aggregate = new Aggregate();

          jun.make(aggregate);
          mid.make(aggregate);
          sen.make(aggregate);

        System.out.println(aggregate);


    }
}
