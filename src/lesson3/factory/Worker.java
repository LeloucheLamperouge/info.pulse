package lesson3.factory;


/**
 * Created by Lelouch on 11.02.2017.
 */
public abstract class Worker {

    public String name;


    public Worker() {

    }

    public Worker(String name) {
        this.name = name;
    }
    public enum carType{Jeep, Sport, MiniVan, Sedan, Roadster};
    public enum carColor{Red, White, Black, Silver};

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }


}
