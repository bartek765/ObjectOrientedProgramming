package pl.kedrabartosz.strategypattern;

public class Vehicle {
    private MovementSpeed movementSpeed;

    public Vehicle(MovementSpeed movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void setMovementSpeed(MovementSpeed movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void travel() {
        movementSpeed.move();
    }
}

