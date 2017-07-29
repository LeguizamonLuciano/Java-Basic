package Clase1;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("A");
        double x = 10;
        double y = 20;
        System.out.println(x + " " + y);

        System.out.println("B");
        x = x + y;
        y = y + x;
        System.out.println(x + " " + y);

        System.out.println("C");
        x = x - y;
        y = y - x;
        System.out.println(x + " " + y);

        System.out.println("D");
        x = x * y;
        y = y * x;
        System.out.println(x + " " + y);

        System.out.println("E");
   
        x = x / y;
        y = y / x;
        System.out.println(x + " " + y);

    }

}
