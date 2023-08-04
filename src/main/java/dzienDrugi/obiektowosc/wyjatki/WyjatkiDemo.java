package dzienDrugi.obiektowosc.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiDemo {
    public static void main(String[] args) {
        int podana = pobierzLiczbe();
        System.out.println("Podana liczba to: " + podana);
    }

    public static int pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        try {
            int liczba = scanner.nextInt();
            System.out.println("Poprawnie pobrana liczba");
            return liczba;
        }catch (InputMismatchException e){
            System.out.println("Błąd, nie podano liczby");
            return -1;
        }

    }
}
