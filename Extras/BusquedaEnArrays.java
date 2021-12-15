package Extras;

import java.util.Scanner;

public class BusquedaEnArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = {1, 8, 3, 4, 22, 5, 8};
        boolean encontrado = false;
        int dato;

        System.out.println("Digite un numero para ver si esta en el arreglo");
        dato = sc.nextInt();

        //Busqueda en el array, asi se busca cierto dato en un array
        int i = 0;
        while (i<7 && encontrado == false){
            if (numeros[i] == dato){
                encontrado = true;
            }
            i++;
        }


         if (encontrado == false){
             System.out.println("El numero no se encuentra en el array");
         }else {
             System.out.println("El numero ha sido encontrado en la posicion: "+ (i-1)); //el i-1 es importante pq cuando se encuentra el numero,lo mismo suma uno y termina.
         }


    }
}
