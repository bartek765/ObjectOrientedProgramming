package pl.kedrabartosz;

public class Dog {
    private String name;
    private int age;
    private String color;
    private double size;
    private String breed;
    private String eyeColor;

    public Dog(String name, int age, String color, double size, String breed, String eyeColor) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
        this.eyeColor = eyeColor;
    }

    public void giveVoice() {
        System.out.println(this.name + " woof woof");
    }
    public void colorAnimal(){
        System.out.println("he have "+ this.color  +" color");
    }
}
