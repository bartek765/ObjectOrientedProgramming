package pl.kedrabartosz;

public class Cat {
    // cechy = pola (field) - co klasa MA
    private String name;
    private int age;
    private String color;

    //konstruktor - zawsze zwraca nowy obiekt (cat)
    public Cat(String newName, int newAge, String newColour){
        this.name = newName;
        this.age = newAge;
        this.color = newColour;
    }
    
    // metoda (method) to to co obiekt *UMIE ROBIĆ* (czasownik)
    public void giveVoice(){
        System.out.println(this.name + " makes meooooow");
    }
    public void colorAnimal(){
        System.out.println("he have "+ this.color  +" color");
    }
}