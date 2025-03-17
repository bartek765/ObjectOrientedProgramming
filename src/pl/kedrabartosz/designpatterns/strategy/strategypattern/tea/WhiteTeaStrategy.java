package pl.kedrabartosz.designpatterns.strategy.strategypattern.tea;

class WhiteTeaStrategy implements TeaStrategy {
    @Override
    public String makeTea() {
        return "white tea";
    }
}