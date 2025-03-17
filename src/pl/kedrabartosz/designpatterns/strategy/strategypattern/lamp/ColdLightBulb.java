package pl.kedrabartosz.designpatterns.strategy.strategypattern.lamp;

public class ColdLightBulb implements Bulb {

    @Override
    public String giveLight() {
        return "cold light";
    }
}
