package lesson3.aggregate;

import java.util.Arrays;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Aggregate {

    private Detail[] details = new Detail[9];

    public Aggregate() {

    }

    public void addDetail(Detail detail) {
        for (int i = 0; i < details.length; i++) {
            if (details[i] == null) {
                details[i] = detail;
                break;
            }
        }
    }

    public void addDetails(Detail... detail) {
        for (int i = 0; i < detail.length; i++) {
            addDetail(detail[i]);
        }
    }

    @Override
    public String toString() {
        return "Aggregate{" +
                "details=" + Arrays.toString(details) +
                '}';
    }
}

