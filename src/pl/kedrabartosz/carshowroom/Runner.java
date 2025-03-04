package pl.kedrabartosz.carshowroom;

public class Runner {
    public static void main(String[] args) {
        SteeringWheel steeringWheel = new SteeringWheel();
        FourWheels fourWheels = new FourWheels();
        Glases glases = new Glases();
        Car car = new Car(steeringWheel, glases, fourWheels);
        car.drive();
        AirConditioning airConditioning = new AirConditioning();
        BetterCar betterCar = new BetterCar(steeringWheel,glases,fourWheels,airConditioning);
        TheBestCar theBestCar = new TheBestCar(steeringWheel,glases,fourWheels,airConditioning);
    }
}
