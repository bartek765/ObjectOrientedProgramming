package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise3;

class Novel implements Book {
    private String title;
    private String author;

    public Novel(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}