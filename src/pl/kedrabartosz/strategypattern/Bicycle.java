package pl.kedrabartosz.strategypattern;

public class Bicycle implements MovementSpeed {
    public void move() {
        System.out.println("Moving at a moderate speed on a bike path.");
    }
}
