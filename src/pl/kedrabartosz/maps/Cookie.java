package pl.kedrabartosz.maps;

public class Cookie {
     String color;
     String stuffing;

    public Cookie(String color, String stuffing) {
        this.color = color;
        this.stuffing = stuffing;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "color='" + color + '\'' +
                ", stuffing='" + stuffing + '\'' +
                '}';
    }
}