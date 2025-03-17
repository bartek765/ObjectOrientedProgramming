package pl.kedrabartosz.designpatterns.strategy.strategypattern.sign;

class BeautifulSinging implements SingingStrategy {
    @Override
    public void sing() {
        System.out.println("Singing extremely beautifully!");
    }
}