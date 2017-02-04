package myInterface;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class Manager extends Employee implements Sign{
    public Manager(String name) {
        super(name);
    }
    @Override
    public void signDocument(){
        System.out.println("Я " + this.name + " - подписываю документ.");
    }
    @Override
    public void delegateTo(Employee employee){
        employee.setDelegate(this);
    }
}
