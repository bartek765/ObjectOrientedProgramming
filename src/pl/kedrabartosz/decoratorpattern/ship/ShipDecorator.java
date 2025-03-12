package pl.kedrabartosz.decoratorpattern.ship;

public abstract class ShipDecorator extends Ship {
    protected Ship ship;

    public ShipDecorator(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String takeOff() {
        return ship.takeOff();
    }
}