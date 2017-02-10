package lesson2;

/**
 * Created by Lelouch on 06.02.2017.
 */
public class WorkersLearning {
    public static void main(String[] args) throws CloneNotSupportedException {


        Worker junior = new Worker("Вася");
        junior.middle = junior.new Middle();
        junior.middle.senior = junior.new Senior();
        System.out.println(junior.hashCode());
        System.out.println(junior.middle.hashCode());
        System.out.println(junior.middle.senior.hashCode());

        Worker junior1 = new Worker("Петя");
        System.out.println("One");
        System.out.println(junior1.hashCode());

        try {
            junior1.mind(junior.middle);
            junior1.megaMind(junior.middle.senior);
        } catch (CloneNotSupportedException e) {
            System.out.println("Моцк не копируецца!");
        }
        System.out.println("Two");
        System.out.println(junior1.hashCode());
        System.out.println("Three");
        System.out.println(junior1.hashCode());
        System.out.println("------------------------------------------------------------");

        Worker junior2 = new Worker("Зюзя");
        System.out.println(junior2.hashCode());
        junior2.setMiddle(junior.middle);

        System.out.println(junior2.hashCode());
        //System.out.println(junior2.hashCode());
    }
}
