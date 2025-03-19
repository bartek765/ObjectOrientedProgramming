package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise2;

class PopSong implements Song {
    private String title;
    private String artist;

    public PopSong(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }
}
