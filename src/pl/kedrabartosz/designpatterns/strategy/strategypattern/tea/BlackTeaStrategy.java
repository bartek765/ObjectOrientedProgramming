package pl.kedrabartosz.designpatterns.strategy.strategypattern.tea;

class BlackTeaStrategy implements TeaStrategy {
    @Override
    public String makeTea() {
        return "black tea";
    }
}