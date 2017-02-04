package lesson1.myInterface;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class Worker extends Employee  {

    public Worker(String name) {
        super(name);
    }

    public void working(){
        System.out.println("Я "+ this.name + " - работаю работу");
    }
    public void signDocument(){
        if(getDelegate() != null);
        System.out.println(this.name + " : временно исполняю обязанности :");
        delegate.signDocument();
        System.out.println(this.name);
    }
}
