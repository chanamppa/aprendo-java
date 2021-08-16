import java.util.Scanner;

public class SwitchAgain {
    public static void main(String[] args) {

        int n;
        Scanner leerNumero = new Scanner(System.in);

        System.out.println("Elíga Una Opción");

        System.out.println("1- Peliculas");
        System.out.println("2- Series");
        System.out.println("3- Cortometrajes");
        System.out.println("4- Salir");

        n= leerNumero.nextInt();

        switch (n){
            case 1:
                System.out.println("Hora de peliculas");
                break;
            case 2:
                System.out.println("Mirate una buena serie");
                break;
            case 3:
                System.out.println("Un pequeño corto para pasar el rato");
                break;
            case 4:
                System.out.println("By Bye");
                break;
            default:
                System.out.println("Elíge una opción");
        }

    }
}

