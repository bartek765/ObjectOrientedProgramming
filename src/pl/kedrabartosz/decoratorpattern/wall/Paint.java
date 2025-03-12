package pl.kedrabartosz.decoratorpattern.wall;

public class Paint extends WallDecorator {
    public Paint(Wall wall) {
        super(wall);
    }

    @Override
    public String create() {
        return super.create() + "\nPaint Wall!";
    }
}
