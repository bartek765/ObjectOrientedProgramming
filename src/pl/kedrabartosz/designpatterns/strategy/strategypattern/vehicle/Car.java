package pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle;

public class Car implements MovementSpeed {
    @Override
    public void move() {
        System.out.println("Moving fast on the highway.");
    }
}


