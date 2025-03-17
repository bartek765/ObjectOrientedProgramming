package pl.kedrabartosz.designpatterns.strategy.strategypattern.sign;

public class Runner {
    public static void main(String[] args) {
        Singer singer = new Singer(new BeautifulSinging());
        singer.perform();

        singer.setSingingStrategy(new OutOfTuneSinging());
        singer.perform();
    }
}
