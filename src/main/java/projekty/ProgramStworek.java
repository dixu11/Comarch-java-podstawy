package projekty;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class ProgramStworek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*******WITAJ OPIEKUNIE*******");
        System.out.println("PRZED TOBĄ ZADANIE ZAJECIA SIĘ WIRTUALNYM STWORKIEM");
        // System.out.println("Proszę podaj imię Twojego stworka");
        String stworekName = JOptionPane.showInputDialog("Proszę podaj imię Twojego stworka:");
        // input.nextInt();

        Random drawValue = new Random();
        int zdrowie = drawValue.nextInt(0, 101);
        int najedzenie = drawValue.nextInt(0, 101);
        int zabawa = drawValue.nextInt(0, 101);


        // Finalne Parametry Stworka
        System.out.println("TWÓJ STWOREK NAZYWA SIĘ: " + stworekName);
        System.out.println("\nPARAMETRY TWOJEGO STWORKA: \nSTAN ZDROWIA:" + stanZdrowia(zdrowie) + "\nNAJEDZENIE:" + stanNajedzenia(najedzenie) + "\nCHĘĆ ZABAWY:" + stanZabawy(zabawa) + "\n");


        // Potencjalne akcje
        int sen = 25; //int zdrowie 66
        // int nakarm = 20; //int najedzenie 50
        int bawSie = 25; //int zabawa 70


        for (int dzien = 1; dzien <= 18; dzien++) {

            System.out.println("\n===============================================\nDzień: " + dzien);
            System.out.println("\nPARAMETRY TWOJEGO STWORKA: \nSTAN ZDROWIA:" + stanZdrowia(zdrowie) + "\nNAJEDZENIE:" + stanNajedzenia(najedzenie) + "\nCHĘĆ ZABAWY:" + stanZabawy(zabawa) + "\n");
            System.out.println("-> CO CHCESZ ZROBIĆ ZE STWORKIEM <- \n1. Ułóż do snu\n2. Nakarm\n3. Baw Sie\n");
            int akcja = Integer.parseInt(JOptionPane.showInputDialog("Podaj akcję:"));
            System.out.println("# RAPORT DZIENNY #");


            if (akcja == 1 && zdrowie < 66) {
                zdrowie += sen;
                System.out.println("Parametr Zdrowia wzrósł\n");
            } else if (akcja == 1 && zdrowie >= 66) {
                System.out.println("Nie można zwiększyć parametru Zdrowia\n");
            } else if (akcja == 2 && najedzenie < 50) {
                int akcjaPokarm = Integer.parseInt(JOptionPane.showInputDialog("Co chcesz zjeść \n1. Ziemniaki\n2. Shake\n3. Kebab\n"));
                if (akcjaPokarm == 1) {
                    najedzenie += 18;
                    zdrowie += 12;
                } else if (akcjaPokarm == 2) {
                    najedzenie += 23;
                } else if (akcjaPokarm == 3) {
                    najedzenie += 28;
                    zdrowie -= 5;
                }
                System.out.println("Parametr Najedzenia wzrósł\n");
            } else if (akcja == 2 && najedzenie >= 50) {
                System.out.println("Nie można zwiększyć parametru Najedzenia\n");
            } else if (akcja == 3 && zabawa < 70) {
                if (najedzenie < 10) {
                    System.out.println("Stworek jest zbyt głody żeby się bawić\n");
                } else {
                    zabawa += bawSie;
                    System.out.println("Parametr Zabawy wzrósł\n");
                    if (najedzenie < 50) {
                        zdrowie -= 5;
                    }
                }
            } else if (akcja == 3 && zabawa >= 70) {
                System.out.println("Nie można zwiększyć parametru Zabawy\n");
            }

            // Dzienne spadki
            zabawa -= 4;
            najedzenie -= 8;
            zdrowie -= 5;

            // Paramy pomocniczne
            System.out.println("Pomocniczy parametr zdrowia: " + zdrowie);
            System.out.println("Pomocniczy parametr najedzenia: " + najedzenie);
            System.out.println("Pomocniczy parametr zabawy: " + zabawa);

            // Czy przeżył
             if (zdrowie < 0) {
                System.out.println("\nNiestety pies nie przeżył \n*** KONIEC GRY ***");
                break;
            } else if (najedzenie < -50) {
                System.out.println("\nNiestety pies nie przeżył z powodu głodu \n*** KONIEC GRY ***");
                break;
            } else if (zabawa < -70) {
                System.out.println("\nTwój pies uciekł \n*** KONIEC GRY ***");
                break;
            }

            // Status na koniec gry
            if (dzien == 3) {
                JOptionPane.showMessageDialog(null,finalResult(zdrowie,najedzenie,zabawa));
                break;
            }
        }

    }
    // Zdrowie:
        public static String stanZdrowia (int paramZdrowie) {
        if (paramZdrowie < 33) {
            return "Chory";
        } else if (paramZdrowie >= 33 && paramZdrowie < 66) {
            return "W dobrej kondycji";
        } else {
            return"Doskonały";
        }
    }
    //Najedzenie
    public static String stanNajedzenia (int paramNajedzenie) {
         if (paramNajedzenie < 10) {
             return "Bardzo Głodny";
         } else if (paramNajedzenie >= 10 && paramNajedzenie < 50) {
             return"Głodny";
         } else  {
             return"Najedzony";
         }
    }
    //Zabawa
    public static String stanZabawy(int paramZabawa) {
        if (paramZabawa < 70) {
            return "Chętny do zabawy";
        } else {
            return "Niechętny do zabawy";
        }
    }

    //FinalResult
    public static String finalResult (int zdrowie, int najedzenie, int zabawa) {
        if (zdrowie < 20 || najedzenie < 20 || zabawa < 20) {
            //JOptionPane.showMessageDialog(null,"Mogłeś się bardziej postarać");
            return "Mogłeś się bardziej postarać";

        } else if (zdrowie < 50 && najedzenie < 50 && zabawa < 50) {
            //JOptionPane.showMessageDialog(null,"Poszło Ci całkiem nieźle");
            return "oszło Ci całkiem nieźle";

        } else if (zdrowie >= 50 && najedzenie >= 50 && zabawa >= 50) {
           // JOptionPane.showMessageDialog(null,"Bardzo dobra Robota!");
            return "Bardzo dobra Robota!";
        } else {
           // JOptionPane.showMessageDialog(null,"Dobra Robota!");
            return "Dobra Robota!";
        }
    }
}
