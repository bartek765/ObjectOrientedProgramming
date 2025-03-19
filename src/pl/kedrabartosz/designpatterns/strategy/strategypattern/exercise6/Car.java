package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise6;

class Car {
    private Transmission transmission;

    public Car(Transmission transmission) {
        this.transmission = transmission;
    }

    public void showTransmission() {
        System.out.println("Samochód ma: " + transmission.getType());
    }
}