package pl.kedrabartosz.decoratorpattern.wall;

public abstract class WallDecorator extends Wall {
    protected Wall wall;

    public WallDecorator(Wall sciana) {
        this.wall = sciana;
    }

    @Override
    public String create() {
        return wall.create();
    }
}