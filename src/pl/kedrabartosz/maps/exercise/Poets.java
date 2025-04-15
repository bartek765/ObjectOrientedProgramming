package pl.kedrabartosz.maps.exercise;

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

  private static Map<String, List<String>> poets(List<String> poets){

  }
}
