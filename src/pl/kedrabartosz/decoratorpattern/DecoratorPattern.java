package pl.kedrabartosz.decoratorpattern;

public class DecoratorPattern {
}
//exercise 1
/*
Jaki problem rozwiązują wzorce projektowe?
Wzorce projektowe rozwiązują typowe problemy w programowaniu, pomagając pisać kod
bardziej przejrzysty, elastyczny i łatwy w utrzymaniu. Ułatwiają ponowne użycie kodu,
redukują złożoność, poprawiają testowalność i standaryzują rozwiązania, co przyspiesza pracę programistów
i zwiększa jakość oprogramowania.
 */
//exercise 2
/*
Czym są wzorce projektowe?
Wzorce projektowe to sprawdzone schematy rozwiązywania typowych problemów w programowaniu,
które ułatwiają pisanie czytelnego, elastycznego i łatwego w utrzymaniu kodu.
 */
//exercise 3
/*
Rodzaje wzorcow projektowych
Kreacyjne – Tworzenie obiektów
Strukturalne – Definiowanie zależności/składu obiektów
Behawioralne – Sterowanie zachowaniem
 */
//exercise 4
/*
Wzory strukturalne
Dekorator – Rozszerza funkcjonalność obiektów bez zmiany ich kodu źródłowego
 */
//exercise 5
/*
Wzorzec Dekorator rozwiązuje problem dynamicznego rozszerzania funkcjonalności obiektów bez
konieczności modyfikowania ich kodu źródłowego. Pozwala uniknąć dziedziczenia, zamiast tego
umożliwiając dodawanie nowych zachowań w sposób elastyczny, poprzez "opakowywanie" obiektów w dodatkowe klasy.
 */
//exercise 6
/*
Dekorator korzysta z kompozycji zamiast dziedziczenia,
dekorator opakowuje obiekt w nową klasę, która dodaje dodatkowe zachowania.
 */
//exercise 7
/*
Zalety Dekoratora:
Dynamiczne rozszerzanie funkcjonalności bez zmiany kodu.
Unikanie nadmiernego dziedziczenia dzięki kompozycji.
Elastyczność – możliwość łączenia dekoratorów.
Lepsza organizacja kodu i jego modularność.
*/
//exercise 8
/*
Wady Dekoratora:
Zwiększona złożoność – może prowadzić do nadmiernej liczby klas.
Trudniejsza analiza kodu – wiele warstw dekoracji utrudnia śledzenie działania obiektu.
Nieprzewidywalna kolejność dekoracji – może powodować nieoczekiwane efekty.
Większe zużycie pamięci – każdy dekorator to dodatkowy obiekt w pamięci.
 */
//exercise 9
/*
Przykład Dekoratora w prawdziwym życiu:
Kawa w kawiarni – podstawowa kawa może być dekorowana dodatkami, np.
mlekiem, syropem, bitą śmietaną. Każdy dodatek to osobny dekorator, który rozszerza smak
i cenę kawy, ale sama baza (espresso) pozostaje niezmieniona.
 */
//exercise 10
/*
B. Tworzę klasę SmallMatrioshka (small|average|big|gigantic) Matrioshka.
C. Ta klasa będzie dziedziczyć po BaseMatrioshka.
Będzie również posiadać pole o typie BaseMatrioshka o nazwie baseMatrioshka.
D. Klasa ta będzie również przesłaniać metodę uncover().
E. W metodzie tej będzie dodana nowa rzecz (np. wypisywanie na konsolę) oraz zostanie
na obiekcie baseMatrioshka wywołana metoda uncover().
F. Tworzę kolejną klasę AverageMatrioshka (average|big|gigantic) Matrioshka.
G. Klasa ta będzie również przesłaniać metodę uncover().
H. W metodzie tej będzie dodana nowa rzecz (np. wypisywanie na konsolę) oraz zostanie
 na obiekcie baseMatrioshka wywołana metoda uncover().
I. Tworzę kolejną klasę BigMatrioshka (big|gigantic) Matrioshka. Powtarzam kroki C-E dla tej oraz ostatniej GiganticMatrioshka.
J. var matrioshka = new GiganticMatrioshka(
    new BigMatrioshka(
        new AverageMatrioshka(
            new SmallMatrioshka(
                new BaseMatrioshka()
            )
        )
    )
);
 */
//exercise 11
/*
TAK
*/
//exercise 12
/*
NIE
Błąd w wywołaniu super.printFace()  klasa Fluid dziedziczy po Face, ale nie powinna korzystac
z super.printFace() ponieważ powinna delegować wywołanie do zawiniętego obiektu face, a nie do klasy nadrzędnej.
Niepoprawne dziedziczenie – wzorzec Dekorator powinien używać kompozycji zamiast dziedziczenia
Zamiast super.printFace() powinno być face.printFace(), aby metoda była delegowana do dekorowanego obiektu.
 */
//exercise 13
/*
// Bazowa klasa
public class Hala {
    public String hostShow() {
        return "Hala organizuje wydarzenie.";
    }
}

// Dekorator bazowy
public abstract class HalaDekorator extends Hala {
    protected Hala hala;

    public HalaDekorator(Hala hala) {
        this.hala = hala;
    }

    @Override
    public String hostShow() {
        return hala.hostShow();
    }
}

// Dekorator 1: Hala Sportowa
public class HalaSportowa extends HalaDekorator {
    public HalaSportowa(Hala hala) {
        super(hala);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + " Teraz przystosowana do zawodów sportowych!";
    }
}

// Dekorator 2: Hala Widowiskowa
public class HalaWidowiskowa extends HalaDekorator {
    public HalaWidowiskowa(Hala hala) {
        super(hala);
    }

    @Override
    public String hostShow() {
        return super.hostShow() + " Teraz przystosowana do koncertów i spektakli!";
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Hala hala = new HalaWidowiskowa(new HalaSportowa(new Hala()));
        System.out.println(hala.hostShow());
    }
}

// Bazowa klasa
public class Statek {
    public String takeOff() {
        return "Statek wyrusza w rejs.";
    }
}

// Dekorator bazowy
public abstract class StatekDekorator extends Statek {
    protected Statek statek;

    public StatekDekorator(Statek statek) {
        this.statek = statek;
    }

    @Override
    public String takeOff() {
        return statek.takeOff();
    }
}

// Dekorator 1: Statek Turystyczny
public class StatekTurystyczny extends StatekDekorator {
    public StatekTurystyczny(Statek statek) {
        super(statek);
    }

    @Override
    public String takeOff() {
        return super.takeOff() + " Wyposażony w luksusowe kabiny!";
    }
}

// Dekorator 2: Statek Kosmiczny
public class StatekKosmiczny extends StatekDekorator {
    public StatekKosmiczny(Statek statek) {
        super(statek);
    }

    @Override
    public String takeOff() {
        return super.takeOff() + " Gotowy do misji kosmicznych!";
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Statek statek = new StatekKosmiczny(new StatekTurystyczny(new Statek()));
        System.out.println(statek.takeOff());
    }
}

// Bazowa klasa
public class Sciana {
    public String create() {
        return "Ściana postawiona.";
    }
}

// Dekorator bazowy
public abstract class ScianaDekorator extends Sciana {
    protected Sciana sciana;

    public ScianaDekorator(Sciana sciana) {
        this.sciana = sciana;
    }

    @Override
    public String create() {
        return sciana.create();
    }
}

// Dekorator 1: Gładź
public class Gladź extends ScianaDekorator {
    public Gladź(Sciana sciana) {
        super(sciana);
    }

    @Override
    public String create() {
        return super.create() + " Nałożono gładź.";
    }
}

// Dekorator 2: Farba
public class Farba extends ScianaDekorator {
    public Farba(Sciana sciana) {
        super(sciana);
    }

    @Override
    public String create() {
        return super.create() + " Pomalowano ścianę!";
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Sciana sciana = new Farba(new Gladź(new Sciana()));
        System.out.println(sciana.create());
    }
}
*/
//exercise 14
/*
Wzorzec Dekorator w Javie pozwala dynamicznie rozszerzać funkcjonalność obiektów,
bez zmieniania ich oryginalnej struktury. Działa poprzez opakowywanie obiektu bazowego
w dodatkowe klasy, które dodają nowe zachowania.

Strumienie I/O (java.io)
BufferedReader opakowuje Reader, dodając buforowanie, co przyspiesza odczyt.

Kolekcje (java.util.Collections)
Collections.synchronizedList() opakowuje zwykłą listę, dodając synchronizację dla pracy wątkowej.

Serwlety (javax.servlet)
HttpServletRequestWrapper pozwala modyfikować żądania HTTP bez zmiany ich kodu bazowego.

Dekorator dodaje nowe funkcje do obiektów w trakcie działania programu, zamiast modyfikować ich oryginalny kod
*/
