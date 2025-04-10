package pl.kedrabartosz.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exercises {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anna", 2);
        map.put("Alicja", 3);
        map.put("Bernadetta", 2);
        map.put("Bogdan", 1);
        map.put("Czesław", 4);
        map.put("Dominik", 10);
        map.put("Elżbieta", 1);
        map.put("Franciszek", 5);
        map.put("Grzegorz", 3);
        map.put("Hernyk", 9);
        map.put("Izydor", 2);
        map.put("Jolanta", 4);
        map.put("Klemens", 19);
        map.put("Luiza", 13);
        map.put("Małgorzata", 14);
        map.put("Niegosława", 2);
        map.put("Oliwia", 7);
        map.put("Przemysław", 8);
        map.put("Radosław", 12);
        map.put("Stanisław", 1);
        map.put("Tobiasz", 2);
        map.put("Urszula", 12);
        map.put("Waldemar", 3);
        map.put("Zygmunt", 9);
        //exercise 1
        map.put("Zdziaslaw", 8);
        //exercise 2
        map.put("Bartek", 1);
        //exercise 3
        map.put("Anastazja", 10);
        //exercise 4
        map.put("Boguslaw", 4);
        //exercise 5
        map.put("Katarzyna", 6);
        //exercise 6
        map.put("Krzysztof", 7);
        //exercise 7
        map.put("Henryka", 1);
        //exercise 8
        map.put("Aleksandra", 16);
        //exercise 9
        map.put("Szymon", 16);
        //exercise 10
        map.put("Wojciech", 4);
        //exercise 14
        // put czyli dodowania pary klucz wartosc do mapy!
        //exercise 15
        // klucz, wartosc
        //exercise 16
        Set<String> key = map.keySet();
        //exercise 17
        //keyset()
        //exercise 18
        //Set<String>
        //exercise 19
        // Bo w mapie każdy klucz musi być unikalny – nie mogą się powtarzać.
        //Lista (List) dopuszcza duplikaty, a Set gwarantuje unikalność elementów, dlatego jest bardziej odpowiedni.
        //exercise 20
        int numberKey = map.keySet().size();
        System.out.println(numberKey);
        //exercise 21
        for (String keys : map.keySet()) {
            System.out.println(keys);
        }
        //
        System.out.println("\n");
        //exercise 22
        for (String keys : map.keySet()) {
            if (keys.endsWith("a")) {
                System.out.println(keys);

            }
        }
        //exercise 66
        map.put("Anna",map.get("Anna")+1);
        System.out.println(map.get("Anna"));
        //exercise 67
        map.put("Przemysław",map.get("Przemysław") + 5);
        System.out.println(map.get("Przemysław"));
        //exercise 68
        map.put("Bernadetta",map.get("Bernadetta") +10);
        System.out.println(map.get("Bernadetta"));
        //exercise 69
        map.put("Alicja", map.get("Alicja") +18);
        System.out.println(map.get("Alicja"));
        //exercise 70
        map.put("KLemens",map.get("Klemens") + 8);
        System.out.println(map.get("Klemens"));
        //exercise 71
        map.put("Oliwia",map.get("Oliwia") + 19);
        System.out.println(map.get("Oliwia"));
        //exercise 72
        map.put("Radosław", map.get("Radosław") - 10);
        System.out.println(map.get("Radosław"));
        //exercise 73
        map.put("Dominik", map.get("Dominik") - 2);
        System.out.println(map.get("Dominik"));
        //exercise 74
        map.put("Franciszek", map.get("Franciszek") * 2);
        System.out.println(map.get("Franciszek"));
        //exercise 75
        map.put("Elżbieta", map.get("Elżbieta") * 3);
        System.out.println(map.get("Elżbieta"));
        //exercise 76
        map.put("Czesław", map.get("Czesław") - 8);
        System.out.println(map.get("Czesław"));
        //exercise 77
        map.put("Franciszek", map.get("Franciszek") * 2);
        System.out.println(map.get("Franciszek"));
        //exercise 78
        for (String keyss : map.keySet()) {
            if (map.get(keyss) > 5) {
                System.out.println(keyss);
            }
        }
        //exercise 79
        for (String keysss : map.keySet()) {
            if (map.get(keysss) > 10) {
                System.out.println(keysss);
            }
        }
        //exercise 80
        for (String keyssss : map.keySet()) {
            if (map.get(keyssss) > 8) {
                System.out.println(keyssss);
            }
        }
        //exercise 81
        for (String keyssss : map.keySet()) {
            if (map.get(keyssss) < 5) {
                System.out.println(keyssss);
            }
        }
        //exercise 82
        for (String keyssss : map.keySet()) {
            if (map.get(keyssss) < 20) {
                System.out.println(keyssss);
            }
        }
        //exercise 83
        for (String keyssss : map.keySet()) {
            if (map.get(keyssss) > 17) {
                System.out.println(keyssss);
            }
        }
        //exercise 84
        for (String keyssss : map.keySet()) {
            if (map.get(keyssss) % 2 == 0) {
                System.out.println(keyssss);
            }
        }
        //exercise 85
        int pack = 0;
        for (Integer keyssss : map.values()) {
            pack += keyssss;
        }
        System.out.println(pack);
        //exercise 86
        int sum = 0;
        for (String keyy : map.keySet()) {
            if (keyy.startsWith("M")) {
                sum += map.get(keyy);
            }
        }
        System.out.println(sum);
        //exercise 87
        int summ = 0;
        for (String keyy : map.keySet()) {
            if (keyy.endsWith("w")) {
                summ += map.get(keyy);
            }
        }
        System.out.println(summ);
        //exercise 88
        int summm = 0;
        for (String keyy : map.keySet()) {
            if (keyy.endsWith("a")) {
                summm += map.get(keyy);
            }
        }
        //exercise 89
        int suumm = 0;
        for (String keyy : map.keySet()) {
            if (keyy.endsWith("r")) {
                suumm += map.get(keyy);
            }
        }
        //exercise 90
        int suuumm = 0;
        for (String keyy : map.keySet()) {
            if (keyy.contains("r")) {
                suuumm += map.get(keyy);
            }
        }
        //exercise 91
        map.remove("Anna");
        // remove usuwa to od razu caly wpis na podsatwie jednego klucza!
        //exercise 92
        Integer actualValue = map.get("Niegosława");// tym mozna wyciagnac aktuana wartosc!
        map.put("Niegosława", 100); // to uzyje do zmiany wartosci ale mozna tez uzyc metody replace!

    }
}
