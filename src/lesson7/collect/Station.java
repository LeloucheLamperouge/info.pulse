package lesson7.collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lelouch on 21.03.2017.
 */
public class Station {
    private int stationID;
    private String stationName;
    List<Passenger> passengerList;


    public Station(int stationID) {
        this.stationID = stationID;
        this.passengerList = new ArrayList<>();
    }
    public void addPassengers(Passenger passenger){
        passengerList.add(passenger);
    }


    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }


    @Override
    public String toString() {
        return "Station{" +
                "stationID=" + stationID +
                ", passengerList=" + passengerList +
                '}';
    }
}
