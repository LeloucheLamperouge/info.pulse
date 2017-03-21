package lesson7.collect;

import java.util.List;

/**
 * Created by Lelouch on 21.03.2017.
 */
public class Line {
    private String lineName;
    List<Station> stations;

    public Line(String lineName, List<Station> stations) {
        this.lineName = lineName;
        this.stations = stations;
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
                '}';
    }
}
