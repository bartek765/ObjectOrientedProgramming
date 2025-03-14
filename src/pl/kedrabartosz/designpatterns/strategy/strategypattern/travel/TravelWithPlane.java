package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class TravelWithPlane implements Travelable{
    @Override
    public String travel() {
        return "I am flying home for Christmas";
    }
}
