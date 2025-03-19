package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise2;

public class Runner {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.add(new RockSong("Bohemian Rhapsody", "Queen"));
        radio.add(new PopSong("Thriller", "Michael Jackson"));
        radio.add(new RockSong("Sweet Child O' Mine", "Guns N' Roses"));
        radio.play();
    }
}
