package pl.kedrabartosz.designpatterns.decorator.pizzamaker.solution;

public class Runner {
    public static void main(String[] args) {
        PizzaMargaritha pizzaMargaritha = new PizzaMargaritha("mozarella");
        PizzaFunghi pizzaFunghi = new PizzaFunghi("champignons",pizzaMargaritha);
        pizzaFunghi.makePizza();
    }
}