package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise7;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.println("Picie czarnej kawy:");
        human.drinkCoffee(new BlackCoffee());

        System.out.println("\nPicie kawy bezkofeinowej:");
        human.drinkCoffee(new DecafCoffee());

        System.out.println("\nPicie kawy zbożowej:");
        human.drinkCoffee(new GrainCoffee());
    }
}