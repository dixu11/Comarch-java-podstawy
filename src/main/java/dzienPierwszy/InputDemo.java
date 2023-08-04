package dzienPierwszy;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        //Narzędzia obiektowe: Random, Scanner - pozwalają wprowadzać dane do programu
        //typ nazwa = wartość;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = input.nextLine();
        System.out.println("Cześć " + name + "!");
        System.out.println("Podaj ulubioną liczbę:");
        double ulubionaLiczba = input.nextDouble();
        System.out.println("Też lubię liczbę " + ulubionaLiczba + "! Co za zbieg okoliczności...");
    }
}
