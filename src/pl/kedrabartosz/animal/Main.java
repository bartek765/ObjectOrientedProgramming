package pl.kedrabartosz.animal;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // <typ> <nazwa> = <wartość>
        Cat cat = new Cat("burek", 2, "czarny"); // konstruktor domyślny bezparametrowy
        // jest dostępny tylko wtedy gdy nie ma innego konstruktora napisanego w klasie
        //  new Cat() --> instancję klasy = obiekt

        cat.giveVoice();

        Cat cat1 = new Cat("filemon", 3, "bialy");
        cat1.giveVoice();
        System.out.println(cat1.getName());
        cat1.setName("dachowiec");
        System.out.println(cat1.getName());
        Dog dog = new Dog("pluto", 1, "bialy", 1, "jamnik", "niebieskie");
        dog.giveVoice();
        Bird bird = new Bird("lelek", 2, "black", 2, 1, "eagle", "blue");
        bird.giveVoice();
        bird.colorAnimal();
        cat.colorAnimal();
        dog.colorAnimal();
        Horse horse = new Horse("fifi", 8, "white", "green");
        horse.colorAnimal();
        horse.giveVoice();
        horse.age();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(cat1);
        // zoo.add(horse);
        // zoo.add(bird);
        // zoo.add(dog);
        System.out.println("**");
        for (int i = 0; i < zoo.size(); i++) {
            Animal animal = zoo.get(i);
            animal.giveVoice();
        /*    Object animal = zoo.get(i);
            if (animal instanceof Cat cat2) {
                cat2.giveVoice();
            }
            if (animal instanceof Dog dog2) {
                dog2.giveVoice();
            }
            if (animal instanceof Horse horse2) {
                horse2.giveVoice();
            }
            if (animal instanceof Bird bird2) {
                bird2.giveVoice();
            }*/
        }

    }
}
// obiektem staje sie dopiero klasa kiedy ja aktywujemy poprzez uzycie konstruktora(new)