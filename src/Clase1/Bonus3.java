package Clase1;

public class Bonus3 {

    public static void main(String[] args) {
        boolean n1 = true;
        boolean n2 = false;
        boolean n3 = true;

        System.out.println("n1 ^ n2= "+(n1 ^ n2));
        System.out.println("(n1 & !n2) | n3)= "+((n1 & !n2) | n3));
        System.out.println("(n1 | n2) & !n3"+((n1 | n2) & !n3));

    }

}
