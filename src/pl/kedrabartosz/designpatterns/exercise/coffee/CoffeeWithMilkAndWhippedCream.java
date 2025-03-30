package pl.kedrabartosz.designpatterns.exercise.coffee;

public class CoffeeWithMilkAndWhippedCream implements SweetOrNo{
    private CoffeeWithMilk coffeeWithMilk;

    public CoffeeWithMilkAndWhippedCream(CoffeeWithMilk coffeeWithMilk) {
        this.coffeeWithMilk = coffeeWithMilk;
    }

    public void setCoffeeWithMilkAndWhippedCream() {
        coffeeWithMilk.setCoffee();
        System.out.println("and whipped cream");
    }
    @Override
    public void sweet() {
        System.out.println("sweet coffee with milk and whipped cream");
    }

    @Override
    public void nosweet() {
        System.out.println("no sweet coffee with milk and whipped cream");
    }
}