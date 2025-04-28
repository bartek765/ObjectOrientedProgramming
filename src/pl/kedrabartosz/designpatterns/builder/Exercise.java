package pl.kedrabartosz.designpatterns.builder;

public class Exercise {
    // exercise 1
    // rozwiązują typowe problemy projektowe, oferując sprawdzone schematy
    // organizacji kodu. Ułatwiają tworzenie czytelnych, elastycznych i łatwych w utrzymaniu rozwiazan
    //exercise 2
    //to sprawdzone, powtarzalne rozwiązania typowych problemów projektowych w programowaniu obiektowym
    //exercise 3
    //Kreacyjne — tworzenie obiektów
    //Behawioralne — sterowanie zachowaniem
    //Strukturalne — definiowanie zależności/składu obiektów
    //exercise 4
    //Budowniczy to wzorzec kreacyjny (czyli nalezy  do grupy odpowiedzialnej za tworzenie obiektów).
    //exercise 5
    //budowniczy należy do wzorców kreacyjnych.
    //exercise 6
    //Budowniczy pomaga tworzyć skomplikowane obiekty krok po kroku.
    //Oddziela sposób budowania od gotowego wyglądu obiektu.
    //exercise 7
    //Budowniczy zastępuje skomplikowane tworzenie obiektów w konstruktorze.
    //exercise 8
    //Ułatwia tworzenie skomplikowanych obiektów.
    //Pozwala lepiej kontrolować, jak krok po kroku powstaje obiekt.
    //exercise 9
    //Budowniczy może być skomplikowany w prostych przypadkach.
    //Wprowadza więcej klas i kodu niż zwykły konstruktor.
    //exercise 10
    //A.
    //W klasie Angel dopisuję statyczną klasę wewnętrzną o nazwie Builder.
    //B.
    //Do nowo utworzonej klasy kopiuję pola z klasy Angel.
    //C.
    //W klasie 1) Builder tworzę metody podobne do setterów, jednak będą one zwracać typ 2) Builder.
    //D.
    //Zmienię modyfikator dostępu konstruktora w klasie Angel na 1) prywatny.
    //Zmienię konstruktor Angel tak, by przyjmował tylko 2) jeden parametr o typie 3) Builder.
    //E.
    //Do klasy 1) Builder dodaję metodę build(), w środku której wywołam 2) nowy konstruktor z klasy Angel, a jako parametr przekażę this.
    //exercise 11
    //tak
    //exercise 12
    //Na co zwróciłbyś uwagę w powyższym kodzie? = na to ze jest za duzo konstruktorow i jest przez to syf w kodzie!
    //Dlaczego warto go ulepszyć? = kod jest mało czytelny, łatwo o pomyłki przy tworzeniu obiektów i trudniej go rozwijać, gdy dodamy nowe pola!
    //Jaki wzorzec byłby pomocny? = Budowniczy!!
    //exercise 13
    // dodane w osobynch klasach!
}
