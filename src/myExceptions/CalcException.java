package myExceptions;

/**
 * Created by Lelouch on 31.01.2017.
 */
public class CalcException extends Exception {

    String msg;

    public CalcException() {

    }

    public CalcException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void outOfRange() throws CalcException {
        throw new CalcException("Число должно находиться в диапазоне от -1000 до 1000");
    }

    public void checkOper(String str) throws CalcException {
        if (str.length() == 0) throw new CalcException("Пустая строка! Необходимо ввести оператор!");
        if (str.length() > 1) throw new CalcException("Неверный ввод!");
    }


}