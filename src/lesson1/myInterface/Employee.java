package lesson1.myInterface;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class Employee implements Comparable<Employee>{


    protected Sign delegate = null;
    public String name;
    public double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }


    public Employee(String name){
        this.name = name;
    }


    public Sign getDelegate(){
        return delegate;
    }
    public void setDelegate(Sign delegate){
        this.delegate = delegate;
    }
}
