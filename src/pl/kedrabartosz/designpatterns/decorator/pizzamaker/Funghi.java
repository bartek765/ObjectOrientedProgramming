package pl.kedrabartosz.designpatterns.decorator.pizzamaker;

public class Funghi extends Margaritha {
    private String mushroms;

    public Funghi(String cheese, String mushroms) {
        super(cheese);
        this.mushroms = mushroms;
    }

    @Override
    public void makePizza() {
        System.out.println(mushroms);
        System.out.println(getCheese());
    }
}