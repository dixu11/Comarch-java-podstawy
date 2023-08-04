package dzienDrugi;

import fundamenty.RozdzielanieNaGrupy;

import java.util.Scanner;

public class MetodyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość minut");
        int minuty = scanner.nextInt();
        int wynik = przeliczNaSekundy(minuty);
        System.out.println(minuty + " to " + wynik + " sekund");
    }

    private static int przeliczNaSekundy(int minuty) {
       // minuty++;  //modyfikacja tej zmiennej nie wpłynie na zmienną "minuty" w main
        return minuty * 60;
    }
    //public we wszystkich pakietach
    //protected w pakiecie i dla klas dziedziczących
    //domyślny (bez pisania dostępu) tylko w tym pakiecie
    //private ( tylko w tej klasie)

}
