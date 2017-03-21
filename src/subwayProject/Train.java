package subwayProject;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Lelouch on 10.02.2017.
 */
@DatabaseTable(tableName = "trains")
public class Train implements Cloneable {

    @DatabaseField(canBeNull = false, useGetSet = true)
    private int trainID;
    @DatabaseField(canBeNull = false, useGetSet = true)
    private int numOfCarriages;
    @DatabaseField(canBeNull = false, useGetSet = true)
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
        if (numOfCarriages == 5){
        this.numOfCarriages = numOfCarriages;
        }
        else System.out.println("Error!");
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
    public boolean setTrain(int numOfCarriages){
          return (numOfCarriages == 5);
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
