package lesson3.factory;


/**
 * Created by Lelouch on 11.02.2017.
 */
public class Worker {

    protected String name;


    public Worker() {

    }

    public Worker(String name) {
        this.name = name;
            }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }

}
