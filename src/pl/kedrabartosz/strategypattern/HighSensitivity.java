package pl.kedrabartosz.strategypattern;

public class HighSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return sound;
    }
}
