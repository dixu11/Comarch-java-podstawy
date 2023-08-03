import java.util.Scanner;

public class Koty {
    public static void main(String[] args) {
        //ilość kuwet = ilość kotów + 1
        //wyświetlenie
        System.out.println("Witaj, podaj ilość kotów, powiem Ci ile kuwet potrzebujesz");


         Scanner pobieracz = new Scanner(System.in);
        int iloscKotow = pobieracz.nextInt();
        //deklaracja zmiennej  + inicjalizacja (wstawienie)

        //wyrażenie:
        int iloscKuwet = iloscKotow + 1;

        //jeśli iloscKuwet to 0 to wykonaj print(nie potrzebujesz żadnych kuwet), jeśli nie to wyświetl iloscKuwet
        if(iloscKotow == 0){
            System.out.println("Nie potrzebujesz żadnych kuwet");
        } else {
            System.out.println("Potrzebujesz " + iloscKuwet + " kuwety");
        }
    }
}
