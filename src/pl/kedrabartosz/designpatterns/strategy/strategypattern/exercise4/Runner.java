package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise4;

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        System.out.println("Ładowanie szybką ładowarką:");
        laptop.charge(new FastCharger());

        System.out.println("\nŁadowanie wolną ładowarką:");
        laptop.charge(new SlowCharger());
    }
}
