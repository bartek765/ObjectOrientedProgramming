package pl.kedrabartosz.designpatterns.strategy.strategypattern.phones;

public class VideoChatPhone implements Phone{
    @Override
    public String makeCall() {
        return "calling my friend from a video phone!";
    }
}
