package pl.kedrabartosz.decoratorpattern.ship;

public class Runner {
    public static void main(String[] args) {
        Ship statek = new ShipSpace(new ShipTouristic(new Ship()));
        System.out.println(statek.takeOff());
    }
}