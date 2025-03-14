package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.wall;

public class Plaster extends WallDecorator {
    public Plaster(Wall wall) {
        super(wall);
    }

    @Override
    public void create() {
        System.out.println("\na coat of glaze was applied");

    }
}
