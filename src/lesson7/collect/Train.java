package lesson7.collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lelouch on 18.03.2017.
 */
public class Train {

    private int trainID;
    List<Carriage> carriageList;


    public Train(int trainID) {
        this.trainID = trainID;
        this.carriageList = new ArrayList<>();
    }

    public void addCarriage(Carriage carriage){
        //TODO add carriage logic
        carriageList.add(carriage);
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public List<Carriage> getCarriageList() {
        return carriageList;
    }

    public void setCarriageList(List<Carriage> carriageList) {
        this.carriageList = carriageList;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID=" + trainID +
                ", carriageList=" + carriageList +
                '}';
    }
}
