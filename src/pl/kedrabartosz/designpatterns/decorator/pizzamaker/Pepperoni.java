package pl.kedrabartosz.designpatterns.decorator.pizzamaker;

public class Pepperoni extends Margaritha{
    private String pepper;

    public Pepperoni(String cheese, String pepper) {
        super(cheese);
        this.pepper = pepper;
    }

    @Override
    public void makePizza() {
        System.out.println(pepper);
        System.out.println(getCheese());
    }
}
