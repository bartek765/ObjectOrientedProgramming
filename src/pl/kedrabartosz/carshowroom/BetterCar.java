package pl.kedrabartosz.carshowroom;

public class BetterCar extends Car {
    private AirConditioning airConditioning;

    public BetterCar(SteeringWheel steeringWheel, Glases glases,
                     FourWheels fourWheels, AirConditioning airConditioning) {
        super(steeringWheel, glases, fourWheels);
        this.airConditioning = airConditioning;
    }
    public void playMusic(){
        System.out.println("I play music");
    }
}
