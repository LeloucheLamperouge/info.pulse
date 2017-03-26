package lesson7.collect;

/**
 * Created by Lelouch on 25.03.2017.
 */
public class Passenger {

    private int passengerID;

    public Passenger(int passengerID) {
        this.passengerID = passengerID;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID=" + passengerID +
                '}';
    }
}
