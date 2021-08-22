import java.util.Scanner;

//Hice una pequeña calculadora donde metes 2 numeros sale el resultado ya sea cualquier
//opcion que hayas elegido
public class Calculadora {
    public static void SUMA( int num1, int num2){
        System.out.println("La suma es: " + (num1 + num2));
    }

    public static void RESTA(int num1, int num2){
        System.out.println("La resta es: " + (num1 - num2));
    }

    public static void MULTIP(int num1, int num2){
        System.out.println("La multiplicación es " + (num1* num2));
    }

    public static void DIVISAO(int num1, int num2){
        System.out.println("La división es " + (num1 / num2));
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion, result, n1, n2;

        do {
            //Acá elegís la opción
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            opcion = leer.nextInt();


            //Desde acá replantea lo que hace depende que opcion o numero eligas
            if (opcion == 1){
                System.out.println("Introduce un número");
                n1= leer.nextInt();
                System.out.println("Introduce otro número");
                n2 = leer.nextInt();

                SUMA(n1, n2);
            }

            if (opcion== 2){
                System.out.println("Introduce un número");
                n1= leer.nextInt();
                System.out.println("Introduce otro número");
                n2 = leer.nextInt();

                RESTA(n1, n2);
            }

            if (opcion==3){
                System.out.println("Introduce un número");
                n1= leer.nextInt();
                System.out.println("Introduce otro número");
                n2 = leer.nextInt();

                MULTIP(n1, n2);
            }

            if (opcion== 4){
                System.out.println("Introduce un número");
                n1= leer.nextInt();
                System.out.println("Introduce otro número");
                n2 = leer.nextInt();

                DIVISAO(n1, n2);
            }

            if (opcion== 5){
                System.out.println("Saliste de la calculadora ;(");
            }

            //Si tocas 5 sale de la calculadora
        }while (opcion!= 5);
    }

}








