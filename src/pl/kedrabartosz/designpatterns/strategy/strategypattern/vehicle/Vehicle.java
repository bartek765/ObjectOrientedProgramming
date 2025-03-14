package pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle;

public class Vehicle {
    private MovementSpeed movementSpeed;
    private int productionYear;

    public Vehicle(MovementSpeed movementSpeed, int productionYear) {
        this.movementSpeed = movementSpeed;
        this.productionYear = productionYear;
    }

    public void setMovementSpeed(MovementSpeed movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void travel() {
        movementSpeed.move();
        System.out.println("jedziemy autem wyprodukowanym w "+ productionYear);
    }
}

