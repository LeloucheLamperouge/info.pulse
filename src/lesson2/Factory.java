package lesson2;

/**
 * Created by Lelouch on 04.02.2017.
 */
public class Factory {
    public static void main(String[] args) throws CloneNotSupportedException {

        Detail detail = new Detail("Gadget");
        System.out.println(detail.toString());
        System.out.println(detail.hashCode());
        Worker worker = new Worker();

        Detail detail1 = new Detail(detail);
        detail1.setDetailName("Other Gadget");
        System.out.println(detail1.toString());
        System.out.println(detail1.hashCode());

        try {
              System.out.println(worker.makeDetail(detail).toString());
              System.out.println(worker.makeDetail(detail).hashCode());
            } catch (CloneNotSupportedException e) {
            System.out.println("Не клонируется");
        }
    }
}