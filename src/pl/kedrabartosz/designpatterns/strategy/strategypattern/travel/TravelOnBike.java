package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class TravelOnBike implements Travelable{
    @Override
    public String travel() {
        return "I am cycling back home for Christmas";
    }
}
