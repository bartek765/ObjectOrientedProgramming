package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise2;

import java.util.ArrayList;
import java.util.List;

class Radio {
    List<Song> songs = new ArrayList<>();

    void add(Song song) {
        songs.add(song);
    }

    void play() {
        for (Song s : songs) {
            System.out.println(s.getTitle() + " - " + s.getArtist());
        }
    }
}
