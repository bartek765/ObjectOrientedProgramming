package pl.kedrabartosz;

public class Bird {
    private String name;
    private int age;
    private String color;
    private double speed;
    private double size;
    private String breed;
    private String eyeColor;

    // pole klasy Tworzenie zmiennych w klasie, ale bez przypisania wartości.
//konstuktor Przypisanie wartości do pól , nic nie zwraca
    public Bird(String name, int age, String color, double speed, double size, String breed, String eyeColor) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.speed = speed;
        this.size = size;
        this.breed = breed;
        this.eyeColor = eyeColor;
    }

    //metoda
    public void giveVoice() {
        System.out.println(this.name + " makes kwi kwi");
    }

    //metoda
    public void colorAnimal() {
        System.out.println("he have " + this.color + " color");
    }
}