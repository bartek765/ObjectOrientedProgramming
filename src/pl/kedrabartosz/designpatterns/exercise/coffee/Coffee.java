package pl.kedrabartosz.designpatterns.exercise.coffee;

public class Coffee implements SweetOrNo{
    @Override
    public void sweet() {
        System.out.println("sweet coffee");
    }

    @Override
    public void nosweet() {
        System.out.println("no sweet coffee");
    }

    public void makeCoffee() {
        System.out.println("standard black coffee");
    }
}