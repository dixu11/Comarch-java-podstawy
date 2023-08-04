package dzienDrugi.obiektowosc.rozszerzenie;

public class Linia {

    //cechy
    int dlugosc;
    String wypelnienie;


    //konstruktor (specjalny rodzaj metody, wykonujący się przy tworzeniu obiektu)
   /* public Linia(int startowaDlugosc, String startoweWypelnienie) {
        System.out.println("Tworze linie!");
        dlugosc = startowaDlugosc;
        wypelnienie = startoweWypelnienie;
    }
*/

    public Linia(int dlugosc, String wypelnienie) {
        System.out.println("Tworze linie!");
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }



    public Linia(String startoweWypelnienie) {
        System.out.println("Tworze linie!");
        dlugosc = 5;
        wypelnienie = startoweWypelnienie;
    }

    //zachowania
    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie.toUpperCase());
            //System.out.print(wypelnienie);
        }
        System.out.println();
    }

}
