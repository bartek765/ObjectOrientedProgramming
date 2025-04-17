package pl.kedrabartosz.maps.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poets {
    public static void main(String[] args) {
        List<String> poets = List.of(
                "Krzysztof Baczyński",
                "Eliza Orzeszkowa",
                "Jan Brzechwa",
                "Maria Konopnicka",
                "Jan Długosz",
                "Wisława Szymborska",
                "Witold Gombrowicz",
                "Maria Pawlikowska",
                "Jan Kochanowski",
                "Gabriela Zapolska",
                "Stanisław Wyspiański",
                "Katarzyna Bonda",
                "Stanisław Witkiewicz",
                "Katarzyna Grochola",
                "Juliusz Słowacki",
                "Maria Jastrzębska"
        );
        System.out.println(poets(poets));
    }

    private static Map<String, List<String>> poets(List<String> poets) {
        Map<String, List<String>> nameToSurnames = new HashMap<>();
        for (int i = 0; i < poets.size(); i++) {
            String poet = poets.get(i);// pobiera aktualny elementy z listy np adam mickiewicz
            String[] poetsSplitted = poet.split(" ");//Dzieli tekst poet po spacji i zapisuje
            // wynik jako tablice "Adam Mickiewicz" ["Adam", "Mickiewicz"]
            String key = poetsSplitted[0];// przypisuje pierwszy elementy z tablicy
            String value = poetsSplitted[1];// przypisuje drugi elementy z tablicy
            //nameToSurnames.put(key, surnames);
            if (nameToSurnames.containsKey(key)) {// sprawdza czy dana mapa zawiera juz to imie jako klucz!
                List<String> values = nameToSurnames.get(key);//pobiera istniejaca liste
                // naziwsk przypisana do name
                values.add(value);// dodaje kolejne naziwsko do tej listy
            } else {
                List<String> surnames = new ArrayList<>();
                surnames.add(value);
                nameToSurnames.put(key, surnames);// jesli key nie istnieje w mapie tworzy nowa
                // liste doddaje do niej nazwisko i zapisuje ja w mapie pod kluczem key!!!
            }
        }
        return nameToSurnames;
    }
}