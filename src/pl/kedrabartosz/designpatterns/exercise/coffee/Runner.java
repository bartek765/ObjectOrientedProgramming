package pl.kedrabartosz.designpatterns.exercise.coffee;

public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.makeCoffee();
        coffee.nosweet();

        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffee);
        coffeeWithMilk.setCoffee();

        CoffeeWithMilkAndWhippedCream coffeeWithMilkAndWhippedCream = new CoffeeWithMilkAndWhippedCream(coffeeWithMilk);
        coffeeWithMilkAndWhippedCream.setCoffeeWithMilkAndWhippedCream();
        coffeeWithMilkAndWhippedCream.nosweet();

        CoffeeWithWhippedCream coffeeWithWhippedCream = new CoffeeWithWhippedCream(coffee);
        coffeeWithWhippedCream.coffeewithwhippedcream();
        coffeeWithWhippedCream.sweet();
        // dodalem opcje z lub bez curku osobno poniewaz uwazalem
        //ze o to chodzi w tym zadaniu(A w dodatku każda z nich może być (lub nie) słodzona cukrem.
        // ale osobiscie uwazam ze uzycie tutaj samego interfejsu bez kompozycji by bylo okej! ale to
        // zadanie pomoglo mi zrouzmiec bardziej czym sie rozni dziedziczenie od kompozycji ze dziedziczy
        // sie metody ktore mozna zmieniac a w kompozycji mozna wziac metode ktora co nawjyzej mozna uruchamiac
        // w swoim kodzie w swojej metodzie a to bylo dla mnie mega wazne bo na poczatku nie moglem zczaic tej roznicy :))
        // ten przyklad zadania pokazuje mi co moze lub nie byc potrzebne w kodzie!
    }
}
