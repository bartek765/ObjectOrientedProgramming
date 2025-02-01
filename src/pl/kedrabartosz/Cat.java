package pl.kedrabartosz;

public class Cat extends Animal {


    //konstruktor - zawsze zwraca nowy obiekt (cat)
    public Cat(String newName, int newAge, String newColour) {
        super(newName, newAge, newColour);

    }

    // metoda (method) to to co obiekt *UMIE ROBIĆ* (czasownik)
    @Override
    public void giveVoice() {
        System.out.println(this.getName() + " makes meooooow");
    }

    public void colorAnimal() {
        System.out.println("he have " + this.getName() + " color");
    }


}