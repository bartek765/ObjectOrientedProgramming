package pl.kedrabartosz.designpatterns.strategy;

public class WarmLightBulb implements Bulb, LED {
    @Override
    public String giveLight() {
        return "warm light";
    }

    @Override
    public boolean isLed() {
        return false;
    }
}
