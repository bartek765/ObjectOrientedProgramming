package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.ship;

public class ShipSpace extends ShipDecorator {
    public ShipSpace(Ship ship) {
        super(ship);
    }

    @Override
    public void takeOff() {
        System.out.println("\nReady to mission space!");
    }
}
