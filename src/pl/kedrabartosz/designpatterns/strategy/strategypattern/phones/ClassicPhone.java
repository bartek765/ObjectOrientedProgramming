package pl.kedrabartosz.designpatterns.strategy.strategypattern.phones;

public class ClassicPhone implements Phone {
    @Override
    public String makeCall() {
        return "calling my friend from a classic phone!";
    }
}