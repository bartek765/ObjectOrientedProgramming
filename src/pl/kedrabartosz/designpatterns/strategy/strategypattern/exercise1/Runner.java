package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise1;

public class Runner {
    public static void main(String[] args) {
        Pot pot = new Pot();

        pot.plantFlower(new Rose("Czerwona"));
        pot.displayFlower();

        pot.plantFlower(new Tulip("Żółty"));
        pot.displayFlower();
    }
}
