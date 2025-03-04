package pl.kedrabartosz.carshowroom;

public class TheBestCar extends BetterCar{
    public TheBestCar(SteeringWheel steeringWheel, Glases glases,
                      FourWheels fourWheels, AirConditioning airConditioning) {
        super(steeringWheel, glases, fourWheels, airConditioning);
    }
    public void park(){
        System.out.println("I park automatically");
    }
}
