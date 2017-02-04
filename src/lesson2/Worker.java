package lesson2;

/**
 * Created by Lelouch on 04.02.2017.
 */
public class Worker {

    private String name;
    public Skills knowledge;

    public void setKnowledge(Skills knowledge) {
        this.knowledge = knowledge;
    }

    public Skills getKnowledge() {
        return knowledge;
    }

    public class Skills {

        public PhysicsKnow physicsKnow;

        public Skills() {

        }



        public void setAllKnowledge(PhysicsKnow physicsKnow) {
            Skills.this.physicsKnow = physicsKnow;

        }

        public PhysicsKnow getAllKnowledge() {
            return physicsKnow;
        }

        public class PhysicsKnow {

            public PhysicsKnow() {

            }


        }

    }




    public Worker(String name) {
        this.name = name;
    }

    public Worker() {

    }

    public Detail makeDetail(Detail detail) throws CloneNotSupportedException {

        Detail detail1 = detail.clone();

        return detail1;
    }


}
