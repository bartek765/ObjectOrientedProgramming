package pl.kedrabartosz.designpatterns.strategy;

public class ColdLightBulb implements Bulb{

    @Override
    public String giveLight() {
        return "cold light";
    }
}
