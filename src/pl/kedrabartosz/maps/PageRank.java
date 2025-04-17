package pl.kedrabartosz.maps;

import java.util.List;
import java.util.Scanner;

public class PageRank {

  public static void main(String[] args) {
    List<String> sentences = List.of(
        "Anna mieć kot oraz pies",
        "Matylda mieć dwa pies i trzy kot"
        );

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj słowo");
    String userWord = scanner.next();

    // ...

    // 1. Zamien na male litery, polskie litery zamien na normalne
    // 2. Usun interpunkcje

    // 3. Podzielił te zdania na wyrazy ["Anna", "miec", "kot", "oraz", "pies"]
    // 4. Zrobił mapę  slowo -> do zdań w ktorych to slowo wystepuje
    //               [
        //              "Pies" -> [zdania w ktorych wystepuje pies]
    //              ]



    // wypisz 3 zdania w ktorych userWord najczesciej wystepuje
  }
}
