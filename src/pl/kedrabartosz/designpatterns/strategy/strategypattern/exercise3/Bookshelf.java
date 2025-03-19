package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise3;

import java.util.ArrayList;
import java.util.List;

class Bookshelf {
    private List<Book> books = new ArrayList<>();

    void add(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b.getTitle() + " - " + b.getAuthor());
        }
    }
}