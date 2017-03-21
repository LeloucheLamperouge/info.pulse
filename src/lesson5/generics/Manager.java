package lesson5.generics;

/**
 * Created by Lelouch on 16.03.2017.
 */
public class Manager {

    private String name;
    private double salary;

    public Manager() {
    }

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.name + ": I'm manage! My salary is: " + this.salary);
    }
}


