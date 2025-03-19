package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise7;

class Human {
    private int energy = 50;

    void drinkCoffee(Coffee coffee) {
        energy += coffee.affectEnergy();
        System.out.println("Po wypiciu kawy energia wynosi: " + energy);
    }
}