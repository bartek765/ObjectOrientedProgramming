package pl.kedrabartosz.designpatterns.strategy.strategypattern.pirouette;

public class Dancer {
    private Pirouette pirouette;

    public Dancer(Pirouette pirouette) {
        this.pirouette = pirouette;
    }

    public void perform(){
        System.out.println("she dances and makes "
                + pirouette.doPirouette() + " pirouettes");
    }
}