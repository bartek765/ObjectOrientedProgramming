package pl.kedrabartosz.decoratorpattern.wall;

public class Paint extends WallDecorator {
    public Paint(Wall wall) {
        super(wall);
    }

    @Override
    public void create() {
        System.out.println("\nPaint Wall");
    }
}
