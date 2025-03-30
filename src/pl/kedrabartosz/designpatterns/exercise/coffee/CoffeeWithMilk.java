package pl.kedrabartosz.designpatterns.exercise.coffee;

public class CoffeeWithMilk implements SweetOrNo{
    private Coffee coffee;

    public CoffeeWithMilk(Coffee coffee) {
        this.coffee = coffee;
    }
    public void setCoffee(){
        coffee.makeCoffee();
        System.out.println("with milk");
    }
    @Override
    public void sweet() {
        System.out.println("sweet coffee with milk");
    }

    @Override
    public void nosweet() {
        System.out.println("no sweet coffee with milk");
    }
}
