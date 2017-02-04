package myInterface;

import java.util.Arrays;

/**
 * Created by Lelouch on 03.02.2017.
 */
public class TestCompar {

    public static void main(String[] args) {
        Employee[]employees = new Employee[3];
        employees[0] = new Employee("Boss", 20000);
        employees[1] = new Employee("Manager", 15000);
        employees[2] = new Employee("Worker", 10000);


        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println("Name = " + employee.getName() + " ,salary " +
            employee.getSalary());
        }

    }
}
