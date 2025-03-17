package pl.kedrabartosz.designpatterns.strategy.strategypattern.lamp;

public class Runner {
    public static void main(String[] args) {
        Bulb bulb = new ColdLightBulb();
        Lamp lamp = new Lamp(false, bulb);
        lamp.turnLampOn();
    }
}
