package lesson2;

/**
 * Created by Lelouch on 04.02.2017.
 */
public class Worker implements Cloneable {

    private String name;
    public Middle middle;


    public void setMiddle(Middle middle) {
        Worker.this.middle = middle;
    }


    public class Middle implements Cloneable {

        private String middleName;
        public Senior senior;

        public Middle() {

            System.out.println(this.getMiddleName() + " " +  " Я дохера умный)))");

        }
        public  Middle (String middleName){
            Worker.this.name = middleName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public Middle (Middle otherMiddle){
            Worker.this.setName(otherMiddle.getMiddleName());
        }


        public Middle createMiddle() {
            return new Middle();
        }

        public void setSenior(Senior senior) {

            Middle.this.senior = senior;
        }

        public Middle cloneM() throws CloneNotSupportedException {
            Middle clonedMiddle = (Middle) super.clone();
            return clonedMiddle;
        }
    }

    public class Senior implements Cloneable {
        private String seniorName;

        public String getSeniorName() {
            return seniorName;
        }

        public void setSeniorName(String seniorName) {Worker.this.name = seniorName;
        }

        public Senior() {
            System.out.println( this.getSeniorName() + " " +   "Теперь я знаю кунг - фу!");
        }
        public Senior (String seniorName){
            this.seniorName = name;
        }
        public Senior (Senior otherSenior){
            Worker.this.setName(otherSenior.getSeniorName());
        }


        public Senior createSenior() {
            return new Senior();
        }

        public Senior cloneS() throws CloneNotSupportedException {
            Senior clonedSenior = (Senior) super.clone();
            return clonedSenior;
        }
    }


    public Worker(String name) {
        Worker.this.name = name;
    }

    public Worker() {
        System.out.println("Я " + this.name + " нихера не знаю!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Detail makeDetail(Detail detail) throws CloneNotSupportedException {
        Detail detail1 = detail.clone();
        return detail1;
    }

    public Middle mind(Middle middle) throws CloneNotSupportedException {
        Middle middle1 = middle.cloneM();
        return middle1;
    }

    public Senior megaMind(Senior senior) throws CloneNotSupportedException {
        Senior senior1 = senior.cloneS();
        return senior1;
    }


}
