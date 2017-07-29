package Clase1;

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("A");
        int x = 5;
        int y = 10;
        int mul = 1;
        int div = 1;
        System.out.println(mul + " " + div);

        System.out.println("B");
        mul = x * y;
        div = x / y;
        System.out.println(mul + " " + div);

        System.out.println("C");
        mul = x * x;
        div = y / y;
        System.out.println(mul + " " + div);

        System.out.println("D");
        mul = x * y * x;
        div = y / x;
        System.out.println(mul + " " + div);

        System.out.println("E");
        mul = x * (-y);
        div = y / (-x);
        System.out.println(mul + " " + div);

    }

}
