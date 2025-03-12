package pl.kedrabartosz.decoratorpattern.hall;

public abstract class HallDecorator extends Hall {
    protected Hall hall;

    public HallDecorator(Hall hala) {
        this.hall = hala;
    }

    @Override
    public String hostShow() {
        return hall.hostShow();
    }
}