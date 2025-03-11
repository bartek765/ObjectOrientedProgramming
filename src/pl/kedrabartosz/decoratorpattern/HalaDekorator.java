package pl.kedrabartosz.decoratorpattern;

public abstract class HalaDekorator extends Hala {
    protected Hala hala;

    public HalaDekorator(Hala hala) {
        this.hala = hala;
    }

    @Override
    public String hostShow() {
        return hala.hostShow();
    }
}