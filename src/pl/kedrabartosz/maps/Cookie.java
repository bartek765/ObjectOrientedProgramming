package pl.kedrabartosz.maps;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cookie cookie = (Cookie) o;
        return this.color.equals(cookie.color) && this.stuffing.equals(cookie.stuffing);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(color);
        result = 31 * result + Objects.hashCode(stuffing);
        return result;
    }
}