package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise1;

class Rose implements Flower {
    private String color;

    public Rose(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return "Róża";
    }

    @Override
    public String getColor() {
        return color;
    }
}