package pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone;

public class HighSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return sound;
    }
}
