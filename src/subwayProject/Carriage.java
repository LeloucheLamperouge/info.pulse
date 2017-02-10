package subwayProject;

/**
 * Created by Lelouch on 10.02.2017.
 */
public class Carriage implements Cloneable {

    private int carrID;
    private int numOfSeats;


    enum TypeOfCarriage {
        LOCOMOTIVE("locomotive & for passenger"), PASSENGER("for passenger"), REPAIR("for repair");
        private final String description;

        TypeOfCarriage(String description) {
            this.description = description;
        }
    }


    private TypeOfCarriage typeOfCarriage;

    public TypeOfCarriage getTypeOfCarriage(){
        return  typeOfCarriage;
    }

    public void setTypeOfCarriage(TypeOfCarriage typeOfCarriage){
        this.typeOfCarriage = typeOfCarriage;
    }


    public int getCarrID() {
        return carrID;
    }

    public void setCarrID(int carrID) {
        this.carrID = carrID;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public Carriage() {
    }

    public Carriage(int carrID, int numOfSeats) {
        this.carrID = carrID;
        this.numOfSeats = numOfSeats;
    }

    public Carriage cloneCarr(Carriage otherCarriage) throws CloneNotSupportedException {
        Carriage clonedCarriage = (Carriage) super.clone();
        return clonedCarriage;
    }

    public void move() {
        System.out.println("Carriage " + this.carrID + " moving");

    }

    public void stop() {
        System.out.println("Carriage " + this.carrID + " stopped");
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "carrID=" + carrID +
                ", numOfSeats=" + numOfSeats +
                ", typeOfCarriage=" + typeOfCarriage +
                '}';
    }
}
