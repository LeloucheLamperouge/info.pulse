package lesson7.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.random;

/**
 * Created by Lelouch on 18.03.2017.
 */
public class Driver  {

    private int driverID;
    private int driverExp;
    private String name;

    List<Train> drivers = new LinkedList<>();

    public Driver(int driverID, String name) {
        this.driverID = driverID;
        this.driverExp = driverExp;
        this.name = name;
    }

    public void addDriver(Train train) {
        drivers.add(train);
    }
    public void driverExpUpDown(){
        driverExp += (int)(Math.random()*10) - 5;
        }


    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getDriverExp() {
        return driverExp;
    }

    public void setDriverExp(int driverExp) {
        this.driverExp = driverExp;
    }

    public List<Train> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Train> drivers) {
        this.drivers = drivers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", driverExp=" + driverExp +
                ", driverName=" + name +
                '}';
    }
}
