package pl.kedrabartosz.designpatterns.strategy.strategypattern.tea;

class GreenTeaStrategy implements TeaStrategy {
    @Override
    public String makeTea() {
        return "green tea";
    }
}