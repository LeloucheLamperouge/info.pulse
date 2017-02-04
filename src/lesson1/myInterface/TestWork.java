package lesson1.myInterface;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class TestWork {
    public static void main(String[] args) {
        Boss boss = new Boss("Большой Босс");
        Manager manager = new Manager("Манагер");
        Worker worker = new Worker("Работник");

        boss.lead();
        manager.signDocument();
        worker.working();

        manager.delegateTo(worker);
        worker.signDocument();

        boss.delegateTo(worker);
        worker.signDocument();




    }
}
