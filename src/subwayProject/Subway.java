package subwayProject;



/**
 * Created by Lelouch on 10.02.2017.
 */
public class Subway {
    public static void main(String[] args) throws CloneNotSupportedException {

        Carriage carriage = new Carriage(1, 50);
        carriage.setTypeOfCarriage(Carriage.TypeOfCarriage.LOCOMOTIVE);
        Carriage carriage1 = new Carriage(2,50);
        carriage1.setTypeOfCarriage(Carriage.TypeOfCarriage.REPAIR);
        System.out.println(carriage);
        System.out.println(carriage.hashCode());
        try {System.out.println(carriage1.cloneCarr(carriage));
            System.out.println(carriage1.hashCode());
        }catch (CloneNotSupportedException e){
            System.out.println("А вот хрен вам");
        }
        carriage.move();
        carriage1.stop();


        Train train = new Train(1,5,carriage);
        train.setTypeOfTrain(Train.TypeOfTrain.PASSENGER);
        train.stop();
        System.out.println(train);
        System.out.println(train.hashCode());
        Train train1 = new Train(1,5,carriage1);
        Train train2 = new Train();
        train1.setTypeOfTrain(Train.TypeOfTrain.SHUNTING);
        train1.move();
        try {
            System.out.println(train1.cloneTrain(train));
            System.out.println(train1.hashCode());
            System.out.println(train2.cloneTrain(train));
            System.out.println(train2.hashCode());
        }catch (CloneNotSupportedException e){
            System.out.println("И вам тоже хрен");
        }

    }


}
