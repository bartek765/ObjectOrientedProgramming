package pl.kedrabartosz.decoratorpattern.hall;

class HallEntertainment extends HallDecorator {

    public HallEntertainment(Hall hall) {
        super(hall);
    }

    @Override
    public void hostShow() {
        System.out.println("\nNow adapted for concerts and performances!");
      //  hall.hostShow();


    }
}