package pl.kedrabartosz.designpatterns.strategy.strategypattern.sign;

class OutOfTuneSinging implements SingingStrategy {
    @Override
    public void sing() {
        System.out.println("You'd better stop.");
    }
}
