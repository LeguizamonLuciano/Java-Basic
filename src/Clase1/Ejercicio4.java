package Clase1;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("A");
        int x = 10;
        int y = 20;
        System.out.println(x + " " + y);

        System.out.println("B");
        x += y;
        y += x;
        System.out.println(x + " " + y);

        System.out.println("C");
        x -= 5;
        y -= 15;
        System.out.println(x + " " + y);

        System.out.println("D");
        x *= 5;
        y *= 15;
        System.out.println(x + " " + y);

        System.out.println("E");
        x /= 5;
        y /= 15;
        System.out.println(x + " " + y);
    }

}
