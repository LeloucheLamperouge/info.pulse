package lesson2;

/**
 * Created by Lelouch on 04.02.2017.
 */
public class Factory {
    public static void main(String[] args) throws CloneNotSupportedException {

        Detail detail = new Detail("Gadget");
        Worker worker = new Worker("Petya");
        Detail detail1 = new Detail(detail);
        detail1.setDetailName("Other Gadget");
        System.out.println(detail1.hashCode());

        Worker worker1 = new Worker("Vasya");
        worker1.knowledge = worker1.new Skills();
        worker1.knowledge.physicsKnow = worker1.knowledge.new PhysicsKnow();

        Worker worker2 = new Worker("Stepan");


        try {
              System.out.println(worker.makeDetail(detail).hashCode());
            } catch (CloneNotSupportedException e) {
            System.out.println("Не клонируется");
        }
        System.out.println(detail.hashCode());

    }
}