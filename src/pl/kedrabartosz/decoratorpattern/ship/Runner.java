package pl.kedrabartosz.decoratorpattern.ship;

public class Runner {
    public static void main(String[] args) {
        Ship ship = new ShipSpace(new ShipTouristic(new Ship()));
        Ship shipTouristic = new ShipTouristic(ship);
        Ship ship1 = new Ship();
        ship1.takeOff();
        shipTouristic.takeOff();
        ship.takeOff();
    }
}