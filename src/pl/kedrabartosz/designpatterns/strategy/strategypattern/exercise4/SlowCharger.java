package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise4;

class SlowCharger implements Charger {
    private String shape, color;
    private int speed;

    public SlowCharger() {
        shape = "Okrągła";
        color = "Biała";
        speed = 5;
    }

    @Override
    public String getShape() { return shape; }

    @Override
    public String getColor() { return color; }

    @Override
    public int getSpeed() { return speed; }
}