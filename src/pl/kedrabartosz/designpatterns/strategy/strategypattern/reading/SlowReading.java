package pl.kedrabartosz.designpatterns.strategy.strategypattern.reading;

public class SlowReading implements ReadingSpeed {
    public void read(String book) {
        System.out.println("Reading " + book + " very slowly..:(((((.");
    }
}