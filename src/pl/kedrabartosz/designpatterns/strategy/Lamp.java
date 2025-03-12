package pl.kedrabartosz.designpatterns.strategy;

public class Lamp {
    private boolean isTurnedOn;
    private Bulb bulb;

    public Lamp(boolean isTurnedOn, Bulb bulb) {
        this.isTurnedOn = isTurnedOn;
        this.bulb = bulb;
    }

    public void turnLampOn() {
        if (!isTurnedOn) {
            isTurnedOn = true;
            System.out.println("włączamy lampę");
            System.out.println(this.bulb.giveLight());
        }
    }
}