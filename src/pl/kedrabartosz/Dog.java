package pl.kedrabartosz;

public class Dog extends Animal {


    public Dog(String name, int age, String color, double size, String breed, String eyeColor) {
        super(name, age, color);
    }

    @Override
    public void giveVoice() {
        System.out.println(this.getName() + " woof woof");
    }

    public void colorAnimal() {
        System.out.println("he have " + this.getName() + " color");
    }
}
