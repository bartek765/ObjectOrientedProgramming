package pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle;

public class Bicycle implements MovementSpeed {
    public void move() {
        System.out.println("Moving at a moderate speed on a bike path.");
    }
}
