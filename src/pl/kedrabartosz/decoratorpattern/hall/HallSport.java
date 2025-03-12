package pl.kedrabartosz.decoratorpattern.hall;

public class HallSport extends HallDecorator {
    public HallSport(Hall hall) {
        super(hall);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + "\nNow adapted for sports competitions!";
    }
}