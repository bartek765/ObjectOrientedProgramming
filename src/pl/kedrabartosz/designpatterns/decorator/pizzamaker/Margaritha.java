package pl.kedrabartosz.designpatterns.decorator.pizzamaker;

public class Margaritha {
    private String cheese;

    public Margaritha(String cheese) {
        this.cheese = cheese;
    }

    public void makePizza() {
        System.out.println(cheese);
    }

    public String getCheese() {
        return cheese;
    }
}