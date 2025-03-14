package pl.kedrabartosz.designpatterns.strategy.strategypattern;

public class NormalReading implements ReadingSpeed {
    public void read(String book) {
        System.out.println("Reading " + book + " at a normal pace.:))");
    }
}
