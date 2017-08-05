package Clase2Switch;

public class Extra2 {

    public static void main(String[] args) {
        char categoria = 'A';
        double sueldo = 15000;

        switch (categoria) {
            case 'A':
                sueldo *=1.50;
                break;
            
            case 'B':
                sueldo *= 1.30;
                break;
           
            case 'C':
                sueldo *= 1.10;
                break;
            
            default:
                sueldo *= 1.05;
                break;
        }
        System.out.println("Sueldo total= "+sueldo);
    }

}
