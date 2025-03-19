package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise5;

public class Runner {
    public static void main(String[] args) {
        Head head = new Head();

        System.out.println("Aplikacja szamponu na porost:");
        head.applyShampoo(new GrowthShampoo());

        System.out.println("\nAplikacja szamponu osłabiającego:");
        head.applyShampoo(new WeakeningShampoo());
    }
}