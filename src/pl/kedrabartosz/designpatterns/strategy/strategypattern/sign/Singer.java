package pl.kedrabartosz.designpatterns.strategy.strategypattern.sign;

class Singer {
    private SingingStrategy singingStrategy;

    public Singer(SingingStrategy singingStrategy) {
        this.singingStrategy = singingStrategy;
    }

    public void setSingingStrategy(SingingStrategy singingStrategy) {
        this.singingStrategy = singingStrategy;
    }

    public void perform() {
        singingStrategy.sing();
    }
}
