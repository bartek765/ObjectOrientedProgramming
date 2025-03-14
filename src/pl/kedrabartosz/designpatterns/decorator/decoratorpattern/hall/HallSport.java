package pl.kedrabartosz.designpatterns.decorator.decoratorpattern.hall;

public class HallSport extends HallDecorator {

    public HallSport(Hall hall) {
        super(hall);
    }

    @Override
    public void hostShow() {
        System.out.println("Now adapted for sports competitions!");
    }
}