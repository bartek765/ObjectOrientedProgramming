package pl.kedrabartosz.decoratorpattern.ship;

public class ShipTouristic extends ShipDecorator {
    public ShipTouristic(Ship ship) {
        super(ship);
    }

    @Override
    public void takeOff() {
        System.out.println("\nHave a luxury cabine!");
    }
}
