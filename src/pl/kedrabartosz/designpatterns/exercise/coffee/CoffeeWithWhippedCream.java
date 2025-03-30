package pl.kedrabartosz.designpatterns.exercise.coffee;

public class CoffeeWithWhippedCream implements SweetOrNo{
    public Coffee coffee;

    public CoffeeWithWhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    public void coffeewithwhippedcream() {
        coffee.makeCoffee();
        System.out.println("and whipped cream");
    }
    @Override
    public void sweet() {
        System.out.println("sweet coffee with whipped cream");
    }

    @Override
    public void nosweet() {
        System.out.println("no sweet coffee with whipped cream");
    }
}