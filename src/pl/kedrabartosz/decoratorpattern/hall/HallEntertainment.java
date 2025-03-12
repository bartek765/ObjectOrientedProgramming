package pl.kedrabartosz.decoratorpattern.hall;

class HallEntertainment extends HallDecorator {
    public HallEntertainment(Hall hall) {
        super(hall);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + "\nNow adapted for concerts and performances!\n";
    }
}