package fundamenty;

import java.util.Scanner;

public class IfyZadania {


    /*
  Zadeklaruj dwie zmienne boolean “deszcz” oraz “swieciSlonce”.

Program ma wyświetlić pogodę sprawdzając ich zawartość:

jeśli pada i świeci słońce: tęcza!
jeśli nie pada i świeci słońce: jest pogodnie!
jeśli nie pada i nie świeci słońce: jest pochmurno..
jeśli pada i nie świeci słońce: ulewa!

    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy pada? tak/nie");
        String padaString = scanner.nextLine();
       // String slowoTak = "tak";
        boolean deszcz =  padaString.equals("tak");
        System.out.println(deszcz);
        System.out.println(!deszcz);
        boolean swieciSlonce = true;
        if (deszcz && swieciSlonce) {
            System.out.println("tęcza");
        }else if(!deszcz && swieciSlonce){
            System.out.println("Jest pogodnie!");
        } else if (!deszcz && !swieciSlonce) {
            System.out.println("Jest pochmurno...");
        } else  {
            System.out.println("Ulewa!");
        }
    }
}
