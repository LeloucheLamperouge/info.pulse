package subwayProject;

/**
 * Created by Lelouch on 10.02.2017.
 */
public class Train implements Cloneable {

    private int trainID;
    private int numOfCarriages;

    private Carriage carriage;

    enum TypeOfTrain{
        PASSENGER("For passenger"), REPAIR("For repair"), SHUNTING("For shunting");
        private final String description;

        TypeOfTrain(String description){
            this.description = description;
        }

    }
    private TypeOfTrain typeOfTrain;


    public TypeOfTrain typeOfTrain() {
        return typeOfTrain;
    }
    public void setTypeOfTrain(TypeOfTrain typeOfTrain){
        this.typeOfTrain = typeOfTrain;
    }

    public Train(){

    }

    public Train(int trainID, int numOfCarriages, Carriage carriage) {
        this.trainID = trainID;
        this.numOfCarriages = numOfCarriages;
        this.carriage = carriage;
    }

    public Train cloneTrain(Train otherTrain)throws CloneNotSupportedException{
        Train clonedTrain = (Train) super.clone();
        return clonedTrain;
    }
    public void move(){
        System.out.println("Train " + this.trainID + " moved");
    }
    public void stop(){
        System.out.println("Train " + this.trainID + " stopped");
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID=" + trainID +
                ", numOfCarriages=" + numOfCarriages +
                ", carriage=" + carriage +
                ", typeOfTrain=" + typeOfTrain +
                '}';
    }
}
