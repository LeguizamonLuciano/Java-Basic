package Clase2;

public class Ejercicio1 {

    public static void main(String[] args) {
        int nro1 = 100, nro2 = 500, nro3 = 250;

        if (nro1 > nro2 && nro1 > nro3) {

            System.out.println("El Primer numero es el mayor");
        } else if (nro2 > nro1 && nro2 > nro3) {
            System.out.println("El Segundo numero es el mayor");
        } else {
            System.out.println("El Tercer numero es el mayor");
        }

    }

}
