package lesson7.collect;

/**
 * Created by Lelouch on 18.03.2017.
 */
public class Carriage {
    private int carriageID;
    TypeOfCarriage typeOfCarriage;

    enum TypeOfCarriage {
        HEAD("locomotive"), PASSENGER("passenger");
        private final String description;

        TypeOfCarriage(String description) {
            this.description = description;
        }

    }

    public Carriage(int carriageID, TypeOfCarriage typeOfCarriage) {
        this.carriageID = carriageID;
        this.typeOfCarriage = typeOfCarriage;
    }

    public int getCarriageID() {
        return carriageID;
    }

    public void setCarriageID(int carriageID) {
        this.carriageID = carriageID;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                " carriageID = " + carriageID +
                "; Type Of Carriage = " + typeOfCarriage.description +
                '}';
    }
}
