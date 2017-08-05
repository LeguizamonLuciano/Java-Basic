package Clase3;

public class Ejercicio5 {

    public static void main(String[] args) {
        int n = 1;
        while (n < 31) {
            if ((n < 10) | (n > 20)) {
                System.out.println(n);
            }
            n++;
        }
    }
}
