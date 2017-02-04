package myInterface;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class Boss extends Employee implements Sign {
    public Boss(String name) {
        super(name);
    }



    public void lead() {
        System.out.println("Я " + this.name + " - руковожу");
    }
    public void stamp(){
        System.out.println("Я директор. Я ставлю штамп на документ. " + this.name);
    }

    @Override
    public void signDocument() {
        System.out.println("Директор. " + this.name);
    }

    @Override
    public void delegateTo(Employee employee) {
        employee.setDelegate(this);
    }
}
