package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise1;

class Tulip implements Flower {
    private String color;

    public Tulip(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return "Tulipan";
    }

    @Override
    public String getColor() {
        return color;
    }
}