package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise3;

public class Runner {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        shelf.add(new Novel("Władca Pierścieni", "J.R.R. Tolkien"));
        shelf.add(new Textbook("Java Programming", "James Gosling"));
        shelf.add(new Novel("1984", "George Orwell"));
        shelf.showBooks();
    }
}
