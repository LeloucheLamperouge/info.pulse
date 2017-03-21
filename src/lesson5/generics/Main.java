package lesson5.generics;

import lesson1.myInterface.*;

/**
 * Created by Lelouch on 16.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasya",25000);
        Manager manager = new Manager("Petya",50000);
        Employee<Worker> employee = new Employee<>(worker);
        Employee<Manager> employee1 = new Employee<>(manager);
        employee.getWork().work();
        employee1.getWork().work();
    }
}
