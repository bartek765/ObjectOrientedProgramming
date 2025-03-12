package pl.kedrabartosz.decoratorpattern.ship;

public class ShipTouristic extends ShipDecorator {
    public ShipTouristic(Ship ship) {
        super(ship);
    }

    @Override
    public String takeOff() {
        return super.takeOff() + "\nHave a luxury cabine!";
    }
}
