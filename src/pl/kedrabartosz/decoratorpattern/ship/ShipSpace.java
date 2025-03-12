package pl.kedrabartosz.decoratorpattern.ship;

public class ShipSpace extends ShipDecorator {
    public ShipSpace(Ship ship) {
        super(ship);
    }

    @Override
    public String takeOff() {
        return super.takeOff() + "\nReady to mission space!";
    }
}
