package lesson3.aggregate;

/**
 * Created by Lelouch on 11.02.2017.
 */
public class Worker {

    private String name;
    private String skills;

    public Worker(String name) {
        this.name = name;
    }

    public Worker(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }


    public void make(Aggregate aggregate) {

        switch (skills) {
            case "junior":
                Detail detail = new Detail("Gadget");
                aggregate.addDetails(detail);
                break;
            case "middle":
                Detail detail1 = new Detail("Gadget");
                Detail detail2 = new Detail("Gadget");
                Detail detail3 = new Detail("Gadget");
                aggregate.addDetails(detail1, detail2, detail3);
                break;

            case "senior":
                Detail detail4 = new Detail("Gadget");
                Detail detail5 = new Detail("Gadget");
                Detail detail6 = new Detail("Gadget");
                Detail detail7 = new Detail("Gadget");
                Detail detail8 = new Detail("Gadget");
                aggregate.addDetails(detail4, detail5, detail6, detail7, detail8);
                break;

        }


    }



}
