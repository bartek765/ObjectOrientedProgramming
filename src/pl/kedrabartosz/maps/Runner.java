package pl.kedrabartosz.maps;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Cookie cookie = new Cookie("blue", "berry");
        Cookie cookie1 = new Cookie("yellow", "lemon");
        Cookie cookie2 = new Cookie("blue", "berry");
        Cookie cookie3 = new Cookie("blue", "berry");
        Cookie cookie4 = new Cookie("yellow", "lemon");
        Cookie cookie5 = new Cookie("green", "apple");
        Cookie cookie6 = new Cookie("green", "apple");
        Cookie cookie7 = new Cookie("orange", "orange");
        Cookie cookie8 = new Cookie("pink", "strawberry");
        Cookie cookie9 = new Cookie("pink", "strawberry");
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie);
        cookies.add(cookie1);
        cookies.add(cookie2);
        cookies.add(cookie3);
        cookies.add(cookie4);
        cookies.add(cookie5);
        cookies.add(cookie6);
        cookies.add(cookie7);
        cookies.add(cookie8);
        cookies.add(cookie9);
       // countingList(cookies);
        Cookie cookieyellow1 = new Cookie("yellow","lemon");
        Cookie cookieyellow2 = new Cookie("yellow","lemon");
        if (cookieyellow2 == cookieyellow1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (cookieyellow2.equals(cookieyellow1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    // metoda ktora przyjmuje liste cookies i wyposuje na konsole ile jest jakich np blue 3 yellow 2;
    public static void countingList(List<Cookie> cookies) {
        int blue = 0;
        int yellow = 0;
        int green = 0;
        int orange = 0;
        int pink = 0;

        for (int i = 0; i < cookies.size(); i++) { // przechodzimy petla przez liste
            Cookie cookie = cookies.get(i); // i dla kazdego elementu  o roboczej nazwie cookie
            if (cookie.color.equals("blue")) { // sprawdzamy jego kolor: jesli kolor jest jednym ze spodziewanych
                blue++; // to inkrementujemy odpowiedni licznik
            } else if (cookie.color.equals("yellow")) {
                yellow++;
            } else if (cookie.color.equals("green")) {
                green++;
            } else if (cookie.color.equals("orange")) {
                orange++;
            } else if (cookie.color.equals("pink")) {
                pink++;
            }
        }

        System.out.println("blue: " + blue);// i na koniec wyswietlamy ile bylo ktorych kolorow
        System.out.println("yellow: " + yellow);
        System.out.println("green: " + green);
        System.out.println("orange: " + orange);
        System.out.println("pink: " + pink);
    }
}// powtorzyc metody w klasie object! gdzie sie daje metode i zasady
// clean code! oraz jak definiujemy listy takze powtorzyc listof ktore
// poznalem(jest ona nie mutowalna, nie akcetpuje null dobra do stalych danych)
// List<String> fruits = List.of("jabłko", "banan"); nie mozna
// potem nic dodawac usuwac itd jest stala! i++ = inkrementujemy!!!!
// przechodzimy przez liste