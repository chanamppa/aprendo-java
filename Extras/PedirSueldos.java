package Extras;

import java.util.Scanner;

//pide 10 sueldos, muestra su suma y cuantos mayores a $1000 hay.
public class PedirSueldos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sueldos, suma = 0, sueldosMayores= 0;

        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Ingresa un sueldo");
            sueldos = leer.nextInt();
            if (sueldos>=1000){
                sueldosMayores++;
            }
            //Asi se suman los numeros pedidos
            suma += sueldos;
        }

        System.out.println("la suma de los sueldos es: "+ suma);
        System.out.println("Hay "+sueldosMayores+ " sueldos que pasan los $1000");
    }
}
