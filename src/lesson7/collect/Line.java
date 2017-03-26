package lesson7.collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lelouch on 21.03.2017.
 */
public class Line {
    private int lineID;
    private String lineName;
    List<Station> stations;
    List<Train> trains;

    public Line(int lineID, String lineName) {
        this.lineID = lineID;
        this.lineName = lineName;
        this.stations = new ArrayList<>();
        this.trains = new ArrayList<>();
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineName='" + lineName + '\'' +
                ", stations=" + stations +
                ", trains=" + trains +
                '}';
    }
}
