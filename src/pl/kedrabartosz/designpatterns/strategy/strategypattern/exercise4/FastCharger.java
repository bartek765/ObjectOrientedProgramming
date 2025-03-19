package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise4;

class FastCharger implements Charger {
    private String shape, color;
    private int speed;

    public FastCharger() {
        shape = "Kwadratowa";
        color = "Czarna";
        speed = 20;
    }

    @Override
    public String getShape() { return shape; }

    @Override
    public String getColor() { return color; }

    @Override
    public int getSpeed() { return speed; }
}
