package Clase1;

public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("A");
        boolean n1 = true;
        boolean n2 = false;
        boolean n3 = !n1;
        boolean n4 = !n2;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        System.out.println("B");
        n3 = n1 && n2;
        n4 = n1 || n2;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        System.out.println("C");
        n3 = !(n1 && n2);
        n4 = !(n1 || n2);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        System.out.println("D");
        n3 = !n1 & n2;
        n4 = !n1 | n2;
        System.out.println(n3 + " " + n4);

        System.out.println("E");
        n3 = n1 ^ n2;
        n4 = n1 ^ !n2;
        System.out.println(n3 + " " + n4);

    }

}
