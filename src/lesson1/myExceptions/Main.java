package lesson1.myExceptions;


import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Lelouch on 28.01.2017.
 */
public class Main {

    public static void main(String[] args) throws CalcException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оператор вычисления :");
        String operation = null;
        try {
            operation = sc.nextLine();
            throw new CalcException();
        } catch (CalcException e) {
             e.checkOper(operation);
        }

        System.out.println("Введите первое число :");
        int x = 0;

        try {
            x = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Число должно быть целым!");
        }
        System.out.println("Введите второе число :");
        int y = 0;

        try {
            y = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Число должно быть целым!");
        }



        Calculator calculator = new Calculator();
        int res = 0;

        try {
            res = calculator.calc(operation, x, y);
            if ((x > 1000 || x < -1000) || (y > 1000 || y < -1000)) throw new CalcException();
        } catch (CalcException e) {
            e.outOfRange();
            System.out.println("Число должно находиться в диапазоне от -1000 до 1000");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        }
        System.out.println(res);
    }

}
