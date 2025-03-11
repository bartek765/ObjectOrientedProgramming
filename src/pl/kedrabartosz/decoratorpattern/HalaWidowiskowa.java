package pl.kedrabartosz.decoratorpattern;

class HalaWidowiskowa extends HalaDekorator {
    public HalaWidowiskowa(Hala hala) {
        super(hala);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + "\nTeraz przystosowana do koncertów i spektakli!";
    }
}