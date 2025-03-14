package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class TravelWithCar implements Travelable{
    @Override
    public String travel() {
        return "I am driving home for Christmas";
    }
}
