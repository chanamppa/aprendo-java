package Extras;

import java.util.Scanner;

public class OrdenamientoDeArrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros[] = new int[10];
        int auxiliar;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = leer.nextInt();
        }

        //Metodo burbuja: es una forma de ordenar a los arrays
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (numeros[j] > numeros[j+1]){ //Si numeroActual > numeroSiguiente
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }

        System.out.println("Arreglo en forma creciente: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(" numero: "+ numeros[i]);
        }

        System.out.println("Arreglo en forma decreciente");
        for (int i = 9; i >=0 ; i--) {
            System.out.println(" numero: "+ numeros[i]);
        }

    }
}
