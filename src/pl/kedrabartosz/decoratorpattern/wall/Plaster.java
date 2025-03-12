package pl.kedrabartosz.decoratorpattern.wall;

public class Plaster extends WallDecorator {
    public Plaster(Wall wall) {
        super(wall);
    }

    @Override
    public String create() {
        return super.create() + "\na coat of glaze was applied\n.";
    }
}
