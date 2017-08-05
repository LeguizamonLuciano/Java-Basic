package Clase2;

import javax.swing.JOptionPane;

public class Ejercicio4BIS {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Ingrese el primer numero");

        String valor2 = JOptionPane.showInputDialog("Ingrese el segundo numero");

        String opcion = JOptionPane.showInputDialog("Seleccione una operacion: \n1 + Suma \n2 - Resta \n3 *Multiplicacion \n4 /Division");

        double n1 = Double.parseDouble(valor1);
        double n2 = Double.parseDouble(valor2);

        switch (opcion) {
            case "+":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (n1 + n2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (n1 - n2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (n1 * n2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (n1 / n2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor ingrese una opcion valida");
                break;

        }
    }

}
