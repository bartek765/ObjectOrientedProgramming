package pl.kedrabartosz.designpatterns.exercise.coffee;

public class Runner {
    public static void main(String[] args) {
        Barista barista = new Barista();

        Coffee coffee1 = new BlackCoffee();
        Coffee coffee2 = new AddOn(new BlackCoffee(), "milk");
        Coffee coffee3 = new AddOn(new AddOn(new BlackCoffee(), "milk"), "whipped cream");
        Coffee coffee4 = new AddOn(new BlackCoffee(), "whipped cream");
        Coffee coffee5 = new AddOn(new AddOn(new BlackCoffee(), "whipped cream"), "sugar");

        barista.serve(coffee1);
        barista.serve(coffee2);
        barista.serve(coffee3);
        barista.serve(coffee4);
        barista.serve(coffee5);
    }
}