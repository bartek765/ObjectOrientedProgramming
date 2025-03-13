package pl.kedrabartosz.strategypattern;

public class LowSensitivity implements MicrophoneSensitivity {
    public String captureSound(String sound) {
        return "ble ble ble";
    }
}
