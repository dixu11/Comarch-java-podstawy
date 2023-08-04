package dzienDrugi;

public class PetleDemo {

    public static void main(String[] args) {
        //while
        //do-while
        //for
        //for-each

        int liczba = 10;
        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia");
        }

        while (liczba > 0) { //spełniony warunek - wykonuję kod i sprawdzam warunek jeszcze raz
            System.out.println("Liczba jest dodatnia");
            liczba = -10;
        }


    }


}
