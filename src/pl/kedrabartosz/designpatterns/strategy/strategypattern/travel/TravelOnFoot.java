package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class TravelOnFoot implements Travelable{
    @Override
    public String travel() {
        return "I am walking back home for Christmas";
    }
}
