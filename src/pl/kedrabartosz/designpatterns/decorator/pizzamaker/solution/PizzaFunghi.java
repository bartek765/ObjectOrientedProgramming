package pl.kedrabartosz.designpatterns.decorator.pizzamaker.solution;

public class PizzaFunghi extends PizzaMargaritha {
    private String mushroms;
    private PizzaMargaritha basePizza;

    public PizzaFunghi(String mushroms, PizzaMargaritha basePizza) {
        super(basePizza.getCheese());
        this.mushroms = mushroms;
        this.basePizza = basePizza;

    }

    @Override
    public void makePizza() {
        System.out.println(mushroms);
        basePizza.makePizza();
    }
}

