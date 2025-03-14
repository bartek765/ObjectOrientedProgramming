package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.wall;

public class Runner {
    public static void main(String[] args) {
        Wall wall = new Paint(new Plaster(new Wall()));
        Wall wall1 = new Wall();
        Wall wall2 = new Plaster(wall);
        wall1.create();
        wall.create();
        wall2.create();
    }
}
