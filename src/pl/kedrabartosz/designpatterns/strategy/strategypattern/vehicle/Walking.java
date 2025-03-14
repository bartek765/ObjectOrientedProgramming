package pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle;

public class Walking implements MovementSpeed {
    public void move() {
        System.out.println("Walking slowly on foot.");
    }
}
