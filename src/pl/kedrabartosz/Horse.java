package pl.kedrabartosz;

public class Horse extends Animal {


    public Horse(String name, int age, String color, String eyecolor) {
        super(name, age, color);
    }
    @Override
    public void giveVoice() {
        System.out.println(this.getName() + "makes ichacha");
    }

    public void colorAnimal() {
        System.out.println("this horse have " + this.getColor() + " color");
    }


    public void age() {
        if (this.getAge() > 2) {
            System.out.println("kon jest starszy!");
        } else {
            System.out.println("ten kon jest jeszcze mlody!");
        }
    }
}
