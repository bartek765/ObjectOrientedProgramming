package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise6;

public class Runner {
    public static void main(String[] args) {
        Car autoCar = new Car(new AutomaticTransmission());
        Car manualCar = new Car(new ManualTransmission());

        autoCar.showTransmission();
        manualCar.showTransmission();
    }
}
