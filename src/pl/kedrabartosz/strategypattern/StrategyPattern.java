package pl.kedrabartosz.strategypattern;

public class StrategyPattern {
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
1.Konstrukcyjne.
2.Strukturalne-Dekorator.
3.Behawioralne-Strategia.
 */
//exercise 5
/*
Jaki problem rozwiazuje wzorzec projektowy strategia?
rozwiązuje problem sztywnego kodu, w którym trzeba używać wielu if-else lub switch.
i wiemy ze klasa bedzie miec wiecej wersji np
 */
//exercise 6
/*
zastępuje nadmierne użycie instrukcji if-else lub switch
 */
//exercise 7
/*
Strategia pozwala uniknąć rozbudowanych instrukcji if-else lub switch, co sprawia,
że kod jest bardziej przejrzysty i łatwiejszy do modyfikacji. Dzięki temu można dynamicznie
zmieniać sposób działania programu bez ingerencji w jego strukturę.
 */
//exercise 8
/*
zwiększa liczbę klas w projekcie, co może utrudniać zarządzanie kodem,
i to ze programisci musza znac ten wzorzec projektowy
 */
//exercise 9
/*
tak poniewaz rozne klasy implementuja ten sam interfejs
 */
//exercise 10
/*
A. Tworzę interfejs o nazwie Telephone.
B. Dodaję do niego metodę makePhoneCall().
Metoda ta nie ma ciała.
C. Dodaję nową klasę ClassicTelephone, która implementuje interfejs Telephone.
D. W tej klasie muszę nadpisać metodę makePhoneCall().
E. Dodaję więc odpowiednią implementację dla klasycznego telefonu do metody makePhoneCall().
F. Tworzę klasę Person.
G. W klasie Person dodaję pole o typie Telephone.
H. W klasie Person dodaję metodę, w której będę wykonywać połączenie.
Wewnątrz tej metody wywołam metodę telephone.makePhoneCall().
I. To wywołanie to przykład polimorfizmu.
 */
//exercise 11
/*
tak
 */
//exercise 12
/*
Uzycie wzorca strategii
 */
//exercise 13
/*
Powtarzający się kod w if-else, co można uprości

Kod stanie się bardziej czytelny i elastyczny

Strategia

Dużo warunkowych instrukcji

wiele

polimorfizm

Tak, w strategii każda klasa implementująca, dostarcza wlasna implementacje
 */
//exercise 14