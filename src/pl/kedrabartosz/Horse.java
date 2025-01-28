package pl.kedrabartosz;

public class Horse {
    private String name;
    private int age;
    private String color;
    private String eyecolor;


    public Horse(String name, int age, String color, String eyecolor) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.eyecolor = eyecolor;
    }
    public void giveVoice(){
        System.out.println(this.name + "makes ichacha");
    }
    public void colorAnimal(){
        System.out.println("this horse have " + this.color + " color");
    }
}
