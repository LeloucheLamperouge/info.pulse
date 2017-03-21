package lesson7.collect;

/**
 * Created by Lelouch on 21.03.2017.
 */
public class Station {
    private String stationName;
    Line line;
    Train train;

    public Station(String stationName, Line line, Train train) {
        this.stationName = stationName;
        this.line = line;
        this.train = train;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", line=" + line +
                ", train=" + train +
                '}';
    }
}
