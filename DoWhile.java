import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("Seleccione un numero");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            //Este scanner sirve para que pueda poner algo dentro de la consola, osea poder escribir
            Scanner sc = new Scanner (System.in);
            response = Integer.valueOf(sc.nextLine());

            //El break es para terminar un flujo, o ciclo
            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                default:
                    System.out.println("Seleccione una opción");
            }
        }while (response != 0);

        }

    }

