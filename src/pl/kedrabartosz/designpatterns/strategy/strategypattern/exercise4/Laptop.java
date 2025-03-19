package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise4;

class Laptop {
    private int battery = 50;

    void charge(Charger charger) {
        System.out.println("Podłączono ładowarkę: " + charger.getShape() + ", kolor: " + charger.getColor());

        while (battery < 90) {
            battery += charger.getSpeed();
            if (battery > 90) battery = 90;
            System.out.println("Ładowanie... Stan baterii: " + battery + "%");
        }

        System.out.println("Laptop naładowany do " + battery + "%!");
    }
}
