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
