package pl.kedrabartosz.designpatterns.strategy.strategypattern.pirouette;

public class FailPirouette implements Pirouette{
    @Override
    public double doPirouette() {
        return 0.5;
    }
}