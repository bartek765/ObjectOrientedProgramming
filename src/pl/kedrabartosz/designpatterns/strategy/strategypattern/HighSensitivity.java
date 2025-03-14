package pl.kedrabartosz.designpatterns.strategy.strategypattern;

public class HighSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return sound;
    }
}
