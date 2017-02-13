package lesson3.aggregate;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Detail {
    private String detailName;


    public Detail(String detailName){
        this.detailName = detailName;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detailName='" + detailName + '\'' +
                '}';
    }
}
