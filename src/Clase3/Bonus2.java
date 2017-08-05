package Clase3;

import java.util.Scanner;

public class Bonus2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 1, valor, max = 0, min = 0;
        while (n <= 5) {
            System.out.println("Ingrese numero");
            valor = teclado.nextInt();
            if (n == 1) {
                max = valor;
                min = valor;
            } else if (valor > max) {
                max = valor;
            } else if (valor < min) {
                min = valor;
            }
            n++;
             }       
            System.out.println("Max: " + max + "\n Min: " + min);
        }

    }
