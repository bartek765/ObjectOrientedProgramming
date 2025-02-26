package CarShowRoom;

public class Car {
    private SteeringWheel steeringWheel;
    private Glases glases;
    private FourWheels fourWheels;

    public Car(SteeringWheel steeringWheel, Glases glases, FourWheels fourWheels) {
        this.steeringWheel = steeringWheel;
        this.glases = glases;
        this.fourWheels = fourWheels;
    }

    public void drive() {
        System.out.println("Standard car is driving");
    }
}
