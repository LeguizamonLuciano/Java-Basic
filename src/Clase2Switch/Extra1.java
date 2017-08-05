package Clase2Switch;

public class Extra1 {

    public static void main(String[] args) {
        int v1 = 10;
        switch (v1 * 2) {
            case 10:
                System.out.println("Case=10");
                break;

            case 20:
                System.out.println("Case=20");
                break;

            case 30:
                System.out.println("Case=30");
                break;

            default:
                System.out.println("No coincide ningun case");
                break;
        }

    }

}
