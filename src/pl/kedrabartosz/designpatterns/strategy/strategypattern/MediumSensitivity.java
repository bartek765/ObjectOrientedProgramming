package pl.kedrabartosz.designpatterns.strategy.strategypattern;

public class MediumSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return sound.replaceAll("[aeiou]", ""); // usuwa samoggoski
    }
}

