package projekty;

import java.util.Random;
import java.util.Scanner;
public class GraWKosci2Graczy {
    static Random random = new Random();
    static int pointsGamer1 = 0;
    static int pointsGamer2 = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean timeToGamer1 = true;
        System.out.println("Gra w kości - Rozszerzona wersja");
        int temPoints = 0;
        while (pointsGamer1 < 20 && pointsGamer2 < 20) {

            System.out.println("Gracz " + (timeToGamer1 ? "1" : "2"));
            System.out.println("Twój tymczasowy wynik to: " + temPoints);
            System.out.println("Trwała pula 1: " + pointsGamer1);
            System.out.println("Trwała pula 2: " + pointsGamer2);

            int choice = getChoice(scanner);

            if (choice == 1) {
                int dice = throwDice();
                System.out.println("Rzucasz... wypadło " + dice);
                temPoints = updateTemporaryScore(temPoints, dice);

                if (dice == 1) {
                    System.out.println("Niestety wypadła jedynka! Tracisz punkty w tym rzucie.");
                    temPoints = 0;
                    timeToGamer1 = !timeToGamer1;
                }

            } else if (choice == 2) {
                saveTemPoints(temPoints, timeToGamer1);
                timeToGamer1 = !timeToGamer1;
                temPoints = 0;
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

        }

        System.out.println("Koniec gry!");
        System.out.println("Wynik gracza 1: " + pointsGamer1 + " punktów.");
        System.out.println("Wynik gracza 2: " + pointsGamer2 + " punktów.");
        scanner.close();
    }

    public static int throwDice() {
        return random.nextInt(6) + 1;
    }

    public static int getChoice(Scanner scanner) {
        System.out.println("Chcesz rzucić kostką czy spasować?");
        System.out.println("1. Rzucam");
        System.out.println("2. Pasuję");
        return scanner.nextInt();
    }

    public static int updateTemporaryScore(int temPoints, int dice) {
        if (dice != 1) {
            return temPoints + dice;
        }
        return 0;
    }

    public static void saveTemPoints(int temPoints, boolean timeToGamer1) {
        if (timeToGamer1) {
            pointsGamer1 += temPoints;
        } else {
            pointsGamer2 += temPoints;
        }
    }
}
