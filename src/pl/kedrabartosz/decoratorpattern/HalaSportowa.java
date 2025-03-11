package pl.kedrabartosz.decoratorpattern;

public class HalaSportowa extends HalaDekorator {
    public HalaSportowa(Hala hala) {
        super(hala);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + "\nTeraz przystosowana do zawodów sportowych!";
    }
}