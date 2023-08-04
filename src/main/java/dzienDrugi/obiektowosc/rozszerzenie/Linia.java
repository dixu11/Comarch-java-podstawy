package dzienDrugi.obiektowosc.rozszerzenie;

public class Linia {

    int dlugosc;
    String wypelnienie;

    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }

}
