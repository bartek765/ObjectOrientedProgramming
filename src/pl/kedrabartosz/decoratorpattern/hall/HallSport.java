package pl.kedrabartosz.decoratorpattern.hall;

public class HallSport extends HallDecorator {

    public HallSport(Hall hall) {
        super(hall);
    }

    @Override
    public void hostShow() {
        System.out.println("Now adapted for sports competitions!");
    }
}