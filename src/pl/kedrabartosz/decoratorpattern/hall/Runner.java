package pl.kedrabartosz.decoratorpattern.hall;

public class Runner {
    public static void main(String[] args) {
        Hall hala = new HallEntertainment(new HallSport(new Hall()));
        System.out.println(hala.hostShow());
    }
}
