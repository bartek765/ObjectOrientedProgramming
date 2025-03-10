package pl.kedrabartosz.animal;

public class Bird extends Animal {


    // pole klasy Tworzenie zmiennych w klasie, ale bez przypisania wartości.
//konstuktor Przypisanie wartości do pól , nic nie zwraca
    public Bird(String name, int age, String color, double speed, double size, String breed, String eyeColor) {
        super(name, age, color);
    }
    @Override
    //metoda
    public void giveVoice() {
        System.out.println(this.getName() + " makes kwi kwi");
    }

    //metoda
    public void colorAnimal() {
        System.out.println("he have " + this.getColor() + " color");
    }
}