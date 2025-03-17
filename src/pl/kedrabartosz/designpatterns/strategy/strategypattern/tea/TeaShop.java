package pl.kedrabartosz.designpatterns.strategy.strategypattern.tea;

class TeaShop {
    private TeaStrategy teaStrategy;

    public TeaShop(TeaStrategy teaStrategy) {
        this.teaStrategy = teaStrategy;
    }

    public void setTeaStrategy(TeaStrategy teaStrategy) {
        this.teaStrategy = teaStrategy;
    }

    public String serveTea() {
        return teaStrategy.makeTea();
    }
}