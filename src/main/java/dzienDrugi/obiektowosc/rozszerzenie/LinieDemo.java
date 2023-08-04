package dzienDrugi.obiektowosc.rozszerzenie;

/*
* Stwórz klasę Linia. Obiekty tej klasy powinny mieć dwie cechy: długość i wypełnienie.
*  W metodzie main stwórz 3 obiekty linni i nadaj im różne długości i symbole wypełnienia.
*  Następnie stwórz metodę void drukujLinie(), która ma drukować symbol ustawiony jako
* wypełnienie tyle razy, jaka jest ustawiona długość linii. np: przy ustawionej długości 6
*  i wypełnieniu "@" wydrukuje następującą linię:

@@@@@@

Przy długości 20 i  wypełnieniu "*" powinna wydrukować linię:

********************

*
* */

public class LinieDemo {
    public static void main(String[] args) {
        Linia linia1 = new Linia();
        linia1.dlugosc = 3;
        linia1.wypelnienie = "a";
        Linia linia2 = new Linia();
        linia2.dlugosc = 7;
        linia2.wypelnienie = "-";
        Linia linia3 = new Linia();
        linia3.dlugosc = 10;
        linia3.wypelnienie = "/";

        linia1.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
    }
}
