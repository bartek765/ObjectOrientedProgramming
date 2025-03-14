package pl.kedrabartosz.designpatterns.strategy.strategypattern.phones;

public class OnlinePhone implements Phone{
    @Override
    public String makeCall() {
        return "calling my friend from an online phone!";
    }
}
