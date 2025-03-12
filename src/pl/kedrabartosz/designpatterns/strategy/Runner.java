package pl.kedrabartosz.designpatterns.strategy;

public class Runner {
    public static void main(String[] args) {
        Bulb bulb = new ColdLightBulb();
        Lamp lamp = new Lamp(false, bulb);
        lamp.turnLampOn();
    }
}
