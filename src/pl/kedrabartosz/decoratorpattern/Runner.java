package pl.kedrabartosz.decoratorpattern;

public class Runner {
    public static void main(String[] args) {
        Hala hala = new HalaWidowiskowa(new HalaSportowa(new Hala()));
        System.out.println(hala.hostShow());
    }
}
