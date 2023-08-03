public class WyrazeniaDemo {
    public static void main(String[] args) {
        System.out.println("hello"); //String - napis
        System.out.println(10); //int - liczba całkowita
        System.out.println(10 + 10);
        System.out.println("hello" + 10);
        System.out.println("10abc" + 10);
        System.out.println(6.5 / 4);  //double  - liczba dziesiętna
        System.out.println(true); //boolean - typ logiczny (true/false)
        System.out.println(false);
        System.out.println(10 > 5);
        System.out.println('a'); //char
        //+ - * / % - arytmetyczne - sprowadzane do int/double
        //== != > >= < <= logiczne - sprowadzane do boolean (true/false)
        //&& || - logiczne lub i oraz (and/or)
        System.out.println(10 > 5 && 10 > 100); // oraz
        System.out.println(10 > 5 || 10 > 100); // lub

        System.out.println(5*10);
        System.out.println((10.0+20.0)/7.0);
        System.out.println("10 + 20 to " + (10 +20));
        System.out.println("30 / 7 daje " + (30.0/7.0));
        System.out.println("Cy wynik równania jest większy od 100: " + ((15*15)>100));

    }
}


