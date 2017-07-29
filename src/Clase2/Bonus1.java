package Clase2;

public class Bonus1 {

    public static void main(String[] args) {
        System.out.println("A");
        int n1 = 20;
        int n2 = 10;
        int n3 = (n1 > n2) ? n1 : 0;
        System.out.println(n3);

        System.out.println("B");
        n1 = 20;
        n2 = 10;
        n3 = (n1 < n2) ? n1 : 0;
        System.out.println(n3);

        System.out.println("C");
        n1 = 20;
        n2 = 10;
        n3 = (n1 == n2) ? n1 : 0;
        System.out.println(n3);

        System.out.println("D");
        n1 = 20;
        n2 = 10;
        n3 = (n1 != n2) ? n1 : 0;
        System.out.println(n3);
    }

}
