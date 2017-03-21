package subwayProject;

import java.io.Serializable;

/**
 * Created by Lelouch on 23.02.2017.
 */
public class TrainDriver implements Serializable{


    private final static long serialVersionUID = 1;

    public String name;
    public int id;
    public Train train;

    public TrainDriver(){

    }
    public TrainDriver(String name){
        this.name = name;
    }
    public TrainDriver(String name,Train train){
        this.name = name;
        this.train = train;
    }

    @Override
    public String toString() {
        return "TrainDriver{" +
                "name='" + name + '\'' +
                ", train=" + train +
                '}';
    }


}
