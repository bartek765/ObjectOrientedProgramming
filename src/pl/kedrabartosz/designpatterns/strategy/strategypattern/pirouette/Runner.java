package pl.kedrabartosz.designpatterns.strategy.strategypattern.pirouette;

public class Runner {
    public static void main(String[] args) {
        var pirouette = new FailPirouette();
        Dancer dancer = new Dancer(pirouette);
        dancer.perform();
    }
}
