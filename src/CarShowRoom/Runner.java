package CarShowRoom;

public class Runner {
    public static void main(String[] args) {
        SteeringWheel steeringWheel = new SteeringWheel();
        FourWheels fourWheels = new FourWheels();
        Glases glases = new Glases();
        Car car = new Car(steeringWheel, glases, fourWheels);
        car.drive();


    }
}
