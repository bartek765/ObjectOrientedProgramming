package pl.kedrabartosz.designpatterns.strategy.strategypattern.travel;

public class Expat {
    private Travelable travelable;
    private String name;

    public Expat(String name, Travelable travelable) {
        this.name = name;
        this.travelable = travelable;
    }

    public void comeBackHome(){
        System.out.println(name + " " + travelable.travel());
    }
}
