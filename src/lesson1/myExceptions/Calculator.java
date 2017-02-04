package lesson1.myExceptions;

/**
 * Created by Lelouch on 28.01.2017.
 */
public class Calculator {

    private double a = 0;
    private double b = 0;
    String str = null;


    public int calc(String str, int a, int b)throws CalcException{

        switch (str) {

            case ("+"):
                return (a + b);

            case ("-"):
                return (a - b);

            case ("*"):
                return (a * b);

            case ("/"):
                return (a / b);

        }
        return 0;
    }

}