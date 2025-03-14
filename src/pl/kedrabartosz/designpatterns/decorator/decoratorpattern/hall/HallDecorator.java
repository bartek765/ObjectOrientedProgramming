package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.hall;

public abstract class HallDecorator extends Hall {
    protected Hall hall;

    public HallDecorator(Hall hall) {
        this.hall = hall;
    }

    @Override
    public void hostShow() {
        hall.hostShow();

    }
}