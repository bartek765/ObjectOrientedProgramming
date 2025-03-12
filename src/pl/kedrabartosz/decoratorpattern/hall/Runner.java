package pl.kedrabartosz.decoratorpattern.hall;

public class Runner {
    public static void main(String[] args) {
        Hall hall = new HallEntertainment(new HallSport(new Hall()));
        Hall hallSport = new HallSport(hall);
        Hall hall1 = new Hall();
        hall.hostShow();
        hallSport.hostShow();
        hall1.hostShow();
    }
}