package Clase2;

public class Ejercicio3 {

    public static void main(String[] args) {
        String user = "Pepito";
        String pass = "1234";

        if (user.equals("Pepe") & pass.equals("1234")) {
            System.out.println("Bienvenido Pepe!!");
        }
        else if (!(user.equals("Pepe")) & pass.equals("1234")) {
            System.out.println("Usuario incorrecto");
        }
        else if (user.equals("Pepe") & !(pass.equals("1234"))) {
            System.out.println("Contraseña incorrecta");
        }
    }
}
