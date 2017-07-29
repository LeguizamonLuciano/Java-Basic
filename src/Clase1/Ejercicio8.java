package Clase1;

public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("A");
        String palabra1 = "Hola";
        String palabra2 = "Mundo";
        System.out.println(palabra1);
        System.out.println(palabra2);

        System.out.println("B");
        String frase = palabra1 + " " + palabra2;
        System.out.println(frase);

        System.out.println("C");
        String frase2 = palabra1 + "\n" + palabra2;
        System.out.println(frase2);

        System.out.println("D");
        String frase3 = palabra1 +"\n "+palabra2;
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(frase3);
        
        System.out.println("E");
        String frase4 = palabra1 +"\n\t"+palabra2;
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(frase4);

    }

}
