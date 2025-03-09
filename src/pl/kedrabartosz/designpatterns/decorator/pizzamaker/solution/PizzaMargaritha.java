package pl.kedrabartosz.designpatterns.decorator.pizzamaker.solution;

public class PizzaMargaritha {
    private String cheese;

    public PizzaMargaritha(String cheese) {
        this.cheese = cheese;
    }

    public void makePizza() {
        System.out.println(cheese);
    }

    public String getCheese() {
        return cheese;
    }
}
