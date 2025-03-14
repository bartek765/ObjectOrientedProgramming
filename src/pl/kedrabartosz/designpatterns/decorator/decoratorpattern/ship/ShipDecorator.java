package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.ship;

public abstract class ShipDecorator extends Ship {
    protected Ship ship;

    public ShipDecorator(Ship ship) {
        this.ship = ship;
    }

    @Override
    public void takeOff() {
        ship.takeOff();
    }
}