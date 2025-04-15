package pl.kedrabartosz.maps.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PanTadeusz {
    public static void main(String[] args) {
        String invocation = """
                Litwo! Ojczyzno moja! ty jesteś jak zdrowie.
                Ile cię trzeba cenić, ten tylko się dowie,
                Kto cię stracił. Dziś piękność twą w całej ozdobie
                Widzę i opisuję, bo tęsknię po tobie.
                """;

        System.out.println("1:");
        checkExerciseOne(exerciseOne(invocation));
        System.out.println("2:");
        checkExerciseTwo(exerciseTwo(invocation));
        System.out.println("3:");
        checkExerciseThree(exerciseThree(invocation));

        Map<Integer,Integer> m = new HashMap<>();
        Map<Integer,Integer> mL = new LinkedHashMap<>(); // linked -> trzyma kolejnosc
        Map<Integer,Integer> mT = new TreeMap<>(); // klucze są posortowane

    }

    private static Map<Character, Integer> exerciseOne(String invocation) {
        // Zamień polskie znaki na łacinskie odpowiedniki
        invocation = normalizePolish(invocation);
        // Zamień wszystko na małe litery i usun znaki interpunkcyjne (zostają tylko litery i spacje)
        invocation = invocation.toLowerCase().replaceAll("[^a-z\\s]", "");
        // Podziel tekst na słowa
        String[] words = invocation.split("\\s+"); // \\s+ jeden lub więcej białych znaków
        // Mapa do zliczania słów na podstawie pierwszej litery
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                //Metoda isEmpty() sprawdza, czy dany łancuch znaków (String) jest pusty, czyli:
                //Wykonuj dalsze operacje tylko, jeśli słowo NIE jest puste.!!!”
                char firstLetter = word.charAt(0);// charAt(0) bierze znak na 0 indexie czyli pierwszy znak
                letterCounts.put(firstLetter, letterCounts.getOrDefault(firstLetter, 0) + 1);
            }
        }
        return letterCounts;
    }

    private static String normalizePolish(String text) {
        return text
                .replace("ą", "a")
                .replace("ć", "c")
                .replace("ę", "e")
                .replace("ł", "l")
                .replace("ń", "n")
                .replace("ó", "o")
                .replace("ś", "s")
                .replace("ź", "z")
                .replace("ż", "z");
    }

    private static Map<Character, List<String>> exerciseTwo(String invocation) {
        // zamień polskie znaki na łacińskie odpowiedniki!
        invocation = normalizePolish(invocation);

        // zamien wszystko na małe litery i usun znaki interpunkcyjne zostaja litery i spacje!!
        invocation = invocation.toLowerCase().replaceAll("[^a-z\\s]", "");

        // rozdziel na słowa
        String[] words = invocation.split("\\s+");
        //\\s+ jeden lub więcej białych znaków

        // mapa: litera = lista słów
        Map<Character, List<String>> wordsPerLetter = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {//mega bezpieczne - w tym przypadku nadmiarowe, Wykonuj dalsze operacje tylko, jeśli słowo NIE
                // jest puste.!!!”
                char firstLetter = word.charAt(0);// charAt(0) bierze znak na 0 indexie czyli pierwszy znak
                wordsPerLetter.computeIfAbsent(firstLetter, k -> new ArrayList<>()).add(word);
                //computifabsent sprawdza czy w mapie istnieje klucz firstletter jesli tak zwraca przypisana wartosc jak
                // nie to tworzy nowa wartosc przypisuje ja do tego klucza i zwraca!
            }
        }
        return wordsPerLetter;
    }

    private static Set<Character> exerciseThree(String invocation) {
        // zamien polskie znaki na łacińskie odpowiedniki
        invocation = normalizePolish(invocation);

        // usun znaki interpunkcyjne, zostaw tylko litery i spacje
        invocation = invocation.toLowerCase().replaceAll("[^a-z\\s]", "");

        // podziel tekst na słowa
        String[] words = invocation.split("\\s+");

        // zbiór unikalnych pierwszych liter
        Set<Character> uniqueLetters = new java.util.HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {//wykonuj dalsze operacje tylko, jeśli słowo NIE jest puste.!!!”
                uniqueLetters.add(word.charAt(0));//dodaje 1 litere
            }
        }
        return uniqueLetters;
    }

    private static void checkExerciseThree(Set<Character> uniqueLetters) {
        var expectedLetters = Set.of('b', 'c', 'd', 'i', 'j', 'k', 'l', 'm', 'o', 'p', 's', 't', 'w', 'z');
        System.out.println(expectedLetters.equals(uniqueLetters));
    }

    private static void checkExerciseTwo(Map<Character, List<String>> wordsPerLetter) {
        Map<Character, List<String>> expectedLetters = new HashMap<>();
        expectedLetters.put('b', List.of("bo"));
        expectedLetters.put('c', List.of("cie", "cenic", "cie", "calej"));
        expectedLetters.put('d', List.of("dowie", "dzis"));
        expectedLetters.put('i', List.of("ile", "i"));
        expectedLetters.put('j', List.of("jestes", "jak"));
        expectedLetters.put('k', List.of("kto"));
        expectedLetters.put('l', List.of("litwo"));
        expectedLetters.put('m', List.of("moja"));
        expectedLetters.put('o', List.of("ojczyzno", "ozdobie", "opisuje"));
        expectedLetters.put('p', List.of("pieknosc", "po"));
        expectedLetters.put('s', List.of("sie", "stracil"));
        expectedLetters.put('t', List.of("ty", "trzeba", "ten", "tylko", "twa", "tesknie", "tobie"));
        expectedLetters.put('w', List.of("w", "widze"));
        expectedLetters.put('z', List.of("zdrowie"));

        System.out.println(expectedLetters.equals(wordsPerLetter));
    }

    private static void checkExerciseOne(Map<Character, Integer> numberOfWordsPerLetter) {
        Map<Character, Integer> expectedLetters = new HashMap<>();
        expectedLetters.put('b', 1);
        expectedLetters.put('c', 4);
        expectedLetters.put('d', 2);
        expectedLetters.put('i', 2);
        expectedLetters.put('j', 2);
        expectedLetters.put('k', 1);
        expectedLetters.put('l', 1);
        expectedLetters.put('m', 1);
        expectedLetters.put('o', 3);
        expectedLetters.put('p', 2);
        expectedLetters.put('s', 2);
        expectedLetters.put('t', 7);
        expectedLetters.put('w', 2);
        expectedLetters.put('z', 1);

        System.out.println(expectedLetters.equals(numberOfWordsPerLetter));
    }
}