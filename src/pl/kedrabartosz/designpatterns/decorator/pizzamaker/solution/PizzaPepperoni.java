package pl.kedrabartosz.designpatterns.decorator.pizzamaker.solution;

public class PizzaPepperoni extends PizzaMargaritha {
    private String pepper;
    private PizzaMargaritha basePizza;

    public PizzaPepperoni(String cheese, String pepper, PizzaMargaritha basepizza) {
        super(basepizza.getCheese());
        this.pepper = pepper;
        this.basePizza = basepizza;
    }

    @Override
    public void makePizza() {
        System.out.println(pepper);
        super.makePizza();
    }
}
