package Clase2;

import java.util.Scanner;


public class Ejercicio3BIS {

   
    public static void main(String[] args) {
        String trueuser = ("Matias");
        String truepass = ("123");
        String user;
        String pass;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        user = teclado.nextLine();
        System.out.println("Ingrese su contraseña");
        pass = teclado.nextLine();
        
        if (user.equals(trueuser) & pass.equals(truepass)) {
            System.out.println("Bienvenido "+user);
        }
        else if (!(user.equals(trueuser)) & pass.equals(truepass)) {
            System.out.println("Usuario incorrecto");
        }
        else if (user.equals(trueuser) & !(pass.equals(truepass))) {
            System.out.println("Contraseña incorrecta");
        }
    }

}
