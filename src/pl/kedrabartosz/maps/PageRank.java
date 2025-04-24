package pl.kedrabartosz.maps;

import java.util.*;

public class PageRank {

    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Anna mieć kot oraz pies",
                "Matylda mieć dwa pies i trzy kot",
                "Mapa to rysunek kraj",
                "Książki dobrze się czytać",
                "Dramat to ulubiony książka",
                "Ulubione zajęcie to spacer z książka lub z pies",
                "Pies i kot to przyjaciele ale pies lepiej",
                "Na wakacje jeździć na wieś gdzie być dużo pies",
                "Pies nie gryźć inne pies",
                "Wszechświat być stary a Ziemia mniej stary",
                "Słonie przynosić szczęście",
                "Krzesła stać przy stół",
                "Siedzieć przy stół",
                "On mieć dużo obrazy z pies",
                "Pies straszyć kot"
        );

        Scanner scanner = new Scanner(System.in);// tworzymy klasy scaner zeby uzytkownik mogl wprowadzic sam!
        System.out.println("Podaj słowo");// wprowadzamy slowo!
        String userWord = scanner.next();// przypisujemy slowo do zmiennej userWord!

        // ...

        // 1. Zamien na male litery, polskie litery zamien na normalne
        // 2. Usun interpunkcje
        List<String> normalizedSentences = new ArrayList<>();//Wywołuje metodę normalizePolish (czyści
        // zdanie z polskich liter i zamienia na małe litery),Dodaje wynik do nowej listy.
        for (String sentence : sentences) {
            normalizedSentences.add(normalizePolish(sentence));
        }

        // 3. Podzielił te zdania na wyrazy ["Anna", "miec", "kot", "oraz", "pies"]
        List<List<String>> wordsInSentences = new ArrayList<>();//Dzieli każde zdanie (już po normalizacji) na tablicę słów.
        //split("\\s+") oznacza: rozdziel tam, gdzie są spacje.
        //Każde takie zdanie jako lista słów dodawane jest do wordsInSentences.
        for (String sentence : normalizedSentences) {
            String[] words = sentence.split("\\s+"); // dzieli po 1 lub więcej spacji
            wordsInSentences.add(List.of(words));
        }
        // 4. Zrobił mapę  slowo -> do zdań w ktorych to slowo wystepuje
        //               [
        //              "Pies" -> [zdania w ktorych wystepuje pies]
        //              ]

        Map<String, List<Integer>> wordToSentences = new HashMap<>();

        for (int i = 0; i < normalizedSentences.size(); i++) {
            String sentence = normalizedSentences.get(i);
            String[] words = sentence.split("\\s+");
//Dla każdego zdania pobiera jego indeks i słowa.
//Dla każdego słowa:
//Jeśli jeszcze go nie ma w mapie, tworzy nowy wpis.
//Jeśli to zdanie jeszcze nie jest dodane do listy w mapie, to dodaje je.
            for (String word : words) {
                // dodaj indeks zdania do mapy
                if (!wordToSentences.containsKey(word)) {
                    wordToSentences.put(word, new ArrayList<>());
                }

                // dodaj ten indeks zdania jeśli jeszcze go nie ma (żeby nie powtarzać)
                if (!wordToSentences.get(word).contains(i)) {//to dodaje informację o tym, w ilu zdaniach występuje dane słowo
                    wordToSentences.get(word).add(i);
                }
            }
        }
        Map<Integer, Integer> wordCountInSentences = new HashMap<>();//W zdaniu numer X słowo użytkownika występuje Y razy

        for (int i = 0; i < normalizedSentences.size(); i++) {//Przegląda każde zdanie,
            //Liczy ile razy userWord (czyli słowo użytkownika) występuje w zdaniu,
            //Jeśli występuje przynajmniej raz, zapisuje liczbę wystąpień w mapie wordCountInSentences.
            String sentence = normalizedSentences.get(i);
            String[] words = sentence.split("\\s+");// dzieli gdzie jest 1 lub wiecej spacji

            int count = 0;
            for (String word : words) {
                if (word.equals(userWord)) {//sprawdza czy to jest to samo slowo jesli tak zwieksza sie  o 1
                    count++;
                }
            }

            if (count > 0) {// jesli chocaiz raz wystapilo slowo to dodaje do mapy numer zdania i ile razy slowo sie pojawilo w tym zdaniu
                wordCountInSentences.put(i, count);// jesli userWord jest pies np i w zdaniu nr 3 sa dwa pies to do mapy zostanie dodane
                //wordCountInSentences.put(3, 2);
            }
        }

        // wypisz 3 zdania w ktorych userWord najczesciej wystepuje
        System.out.println("\nTop 3 zdania, w których słowo \"" + userWord + "\" występuje najczęściej:");
        // Tworzymy kopię mapy, żeby niczego nie usunąć z oryginału
        Map<Integer, Integer> copy = new HashMap<>(wordCountInSentences);

        for (int i = 0; i < 3; i++) {//Szuka 3 razy zdania z największą liczbą wystąpień słowa.
            // W każdej iteracji:
            //Przeszukuje mapę, znajduje zdanie z największą wartością,
            //Wypisuje je, Usuwa je z mapy, by nie powtórzyć w kolejnej iteracji.
            int maxIndex = -1;// domyslna wartosc!
            int maxCount = 0;
            // używamy entrySet(), które zwraca zestaw wszystkich par klucz–wartość z mapy copy
            // Szukamy zdania z największą liczbą wystąpień
            for (Map.Entry<Integer, Integer> entry : copy.entrySet()) {
                //entry.getKey() → zwraca klucz (czyli numer zdania),
                //entry.getValue() → zwraca wartość (czyli ile razy słowo się tam pojawiło).
                if (entry.getValue() > maxCount) {//czy liczba wystąpień (entry.getValue()) jest większa niż dotychczasowy maxCount.
                    maxIndex = entry.getKey();//zapisuje numer tego zdania!
                    maxCount = entry.getValue();// zapisuje najwieksza jego wartosc!!
                }
            }

            if (maxIndex != -1) {// jesli znalezione zdanie ktore zawiera najwiecej razy userWord to wejdzie do ifa, jesli niema zdania to nie zadziala
                System.out.println("- (" + maxCount + "x) " + sentences.get(maxIndex));
                //maxCount — ile razy wystąpiło w nim dane słowo (np. 2x),
                //sentences.get(maxIndex) — pobiera oryginalną wersję zdania z listy sentences, a nie normalizedSentences.
                copy.remove(maxIndex);
                //usuwa to zdanie z mapy copy, żeby nie brać go pod uwagę w kolejnych iteracjach (szuka 3 różnych zdań).
            }
        }
    }

    //tu zrobiony pkt 1 i 2
    private static String normalizePolish(String text) {// ta metoda zamienia caly tekst na male litery, zamienia polskie znaki
        text = text.toLowerCase();
        text = text.replace("ą", "a")
                .replace("ć", "c")
                .replace("ę", "e")
                .replace("ł", "l")
                .replace("ń", "n")
                .replace("ó", "o")
                .replace("ś", "s")
                .replace("ź", "z")
                .replace("ż", "z");

        return text;
    }
}
