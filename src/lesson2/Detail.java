package lesson2;

/**
 * Created by Lelouch on 04.02.2017.
 */
public class Detail implements Cloneable {

    private String detailName;

    public Detail() {
    }

    public Detail(String detailName) {
        this.detailName = detailName;
    }

    public Detail(Detail otherDetail){
        this.setDetailName(otherDetail.getDetailName());
    }

    public Detail clone() throws CloneNotSupportedException{
        Detail clonedDetaile = (Detail) super.clone();
        return clonedDetaile;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }
}

