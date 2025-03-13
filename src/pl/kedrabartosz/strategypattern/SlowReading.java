package pl.kedrabartosz.strategypattern;

public class SlowReading implements ReadingSpeed {
    public void read(String book) {
        System.out.println("Reading " + book + " very slowly..:(((((.");
    }
}