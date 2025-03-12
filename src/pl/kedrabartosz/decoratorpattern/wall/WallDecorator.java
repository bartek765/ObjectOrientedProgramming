package pl.kedrabartosz.decoratorpattern.wall;

public abstract class WallDecorator extends Wall {
    protected Wall wall;

    public WallDecorator(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void create() {
        wall.create();
    }
}