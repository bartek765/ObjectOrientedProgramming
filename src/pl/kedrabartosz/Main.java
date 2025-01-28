package pl.kedrabartosz;


public class Main {
    public static void main(String[] args) {
        // <typ> <nazwa> = <wartość>
        Cat cat = new Cat("burek", 2, "czarny"); // konstruktor domyślny bezparametrowy
        // jest dostępny tylko wtedy gdy nie ma innego konstruktora napisanego w klasie
        //  new Cat() --> instancję klasy = obiekt

        cat.giveVoice();

        Cat cat1 = new Cat("filemon", 3, "bialy");
        cat1.giveVoice();
        Dog dog = new Dog("pluto", 1, "bialy", 1, "jamnik", "niebieskie");
        dog.giveVoice();
        Bird bird = new Bird("lelek", 2, "black", 2, 1, "eagle", "blue");
        bird.giveVoice();
        bird.colorAnimal();
        cat.colorAnimal();
        dog.colorAnimal();
        Horse horse = new Horse("fifi",8,"white","green");
        horse.colorAnimal();
        horse.giveVoice();
    }
}
// obiektem staje sie dopiero klasa kiedy ja aktywujemy poprzez uzycie konstruktora(new)