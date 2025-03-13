package pl.kedrabartosz.strategypattern;

public class Microphone {
    private MicrophoneSensitivity sensitivity;

    public Microphone(MicrophoneSensitivity sensitivity) {
        this.sensitivity = sensitivity;
    }

    public void setSensitivity(MicrophoneSensitivity sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String record(String sound) {
        return sensitivity.captureSound(sound);
    }
}
