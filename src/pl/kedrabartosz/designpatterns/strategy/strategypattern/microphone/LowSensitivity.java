package pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone;

public class LowSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return "ble ble ble";
    }
}
