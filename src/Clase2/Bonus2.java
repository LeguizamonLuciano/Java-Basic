package Clase2;

public class Bonus2 {

    public static void main(String[] args) {
        double sueldo = 10000;
        if (sueldo > 9800) {
            sueldo *= 1.20;
        } else if (sueldo > 7500) {
            sueldo *= 1.50;
        } else if (sueldo > 5000) {
            sueldo *= 1.80;
        } else {
            sueldo *= 1.90;
        }
        System.out.println("Sueldo= "+sueldo);

    }

}
