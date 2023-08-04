package dzienDrugi;

import java.util.Scanner;

public class PetlaWhilePraktyka {

    //Jak dobrać pętlę?
    // Pętli uzywamy jeśli chcemy wielokrotnie wykonywać jakiś kod
    // Zawsze można zrobić to pętlą while, czasem wygodnie jest wybrać inną wyspecjalizowaną pętlę
    // Jeśli chcemy numerować powtórzenia np. wykonać kod x razy, najlepszy będzie for
    // Jeśli kod ma się wykonać przynajmniej raz, do pewnego zdarzenia - do-while

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  int odpowiedz = 0;
        while (odpowiedz != 3) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("Opcja 1");
            System.out.println("Opcja 2");
            System.out.println("Opcja 3 - koniec programu");
            odpowiedz = scanner.nextInt();
        }*/

        int odpowiedz;
        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("Opcja 1");
            System.out.println("Opcja 2");
            System.out.println("Opcja 3 - koniec programu");
            odpowiedz = scanner.nextInt();
        } while (odpowiedz != 3);
    }
}
