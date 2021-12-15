import java.util.Scanner;

public class BucleForEach {
    public static void main(String[] args) {
        String [] autos = {"Bmw", "Ford", "Toyota", "Audi", "Ferrari", "Mercedes Benz"};

        //El for debe ser del mismo tipo que el array
        for (String nombreAutos: autos) {
            System.out.println(nombreAutos);
        }
        
        
        //Ejercico= leer 5 numeros, guardarlos en un array y mostrarlos
        Scanner leer = new Scanner(System.in);
        float[] numeros = new float[5];

        for (int i = 0; i < 5; i++) {
            //el i+1 sirve para que el conteo empieze desde 1
            System.out.println((i+1)+ ". Digite un numero: ");
            numeros[i] = leer.nextFloat();
        }

        System.out.print("Los numeros introducidos son: ");
        for (float i: numeros) {
            System.out.println(i);
        }
    }
}
