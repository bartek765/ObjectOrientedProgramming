package pl.kedrabartosz.decoratorpattern.wall;

public class Runner {
    public static void main(String[] args) {
        Wall wall = new Paint(new Plaster(new Wall()));
        System.out.println(wall.create());
    }
}
