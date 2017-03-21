package lesson5.generics;

/**
 * Created by Lelouch on 16.03.2017.
 */
public class Employee<T>{

    private T work;

    public Employee() {
    }


    public Employee(T work) {
        this.work = work;
    }

    public T getWork() {
        return work;
    }

    public void setWork(T work) {
        this.work = work;
    }

}
