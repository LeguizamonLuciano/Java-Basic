package Clase2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        double n1;
        double n2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        n2 = teclado.nextDouble();
        System.out.println("Seleccione una operacion: \n1-Suma \n2-Resta \n3-Multiplicacion \n4-Division");
        String opcion = teclado.next();
        switch (opcion) {
            case "1":
                System.out.println("El resultado es: " + (n1 + n2));
                break;
            case "2":
                System.out.println("El resultado es: " + (n1 - n2));
                break;
            case "3":
                System.out.println("El resultado es: " + (n1 * n2));
                break;
            case "4":
                System.out.println("El resultado es: " + (n1 / n2));
                break;
            default:
                System.out.println("Por favor ingrese una opcion valida");
                break;

        }
    }

}
