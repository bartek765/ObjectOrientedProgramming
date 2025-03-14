package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class Runner {
    public static void main(String[] args) {
        Travelable travelable = new TravelOnBike();
        Expat expat = new Expat("Robert" , travelable);
        expat.comeBackHome();
    }
}
