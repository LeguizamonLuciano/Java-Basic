package Clase3;

import java.text.DecimalFormat;

public class Bonus4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");

        double dinero = 1000;
        double mes = 1;

        while (mes <= 12) {
            dinero = dinero *= 1.02;
            mes++;
        }
        System.out.println("Dinero=" + df.format(dinero));
    }
}
