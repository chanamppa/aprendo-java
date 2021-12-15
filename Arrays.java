import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //el signo [] se puede poner en ambos lados
        // El tamaño del array se declara en un primer momento y luego no puede cambiar durante la ejecucion del programa
        String[] androidVersions = new String[17];
        int days[] = new int[7];

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        //Array de 3 dimesiones
        int[][][] numbers = new int[2][2][2];

        //Array de 2 dimensiones
        String[][] cities = new String[3][2];
        /*  1             2
        Argentina  Estados Unidos
       2- 1 -BsAs      -Washington DC
       1- 2 -Cordoba   -Minnesota
       0- 3 -San Juan  -Florida
                0           1
         */


        //Los numero son en las posiciones que se encuentran
        //Declarando los valores del array
        cities[0][0] = "San Juan";
        cities[0][1] = "Florida";
        cities[1][0] = "Cordoba";
        cities[1][1] = "Minnesota";
        cities[2][0] = "BSAS";
        cities[2][1] = "Washington DC";

        //llamamos un for para recorrer el array de 2 dimensiones
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }


        //Otra forma de declarar un array
        String[] letras = {"a", "b", "c"};
        System.out.println(letras[0]);


        //Otra forma de declarara arrays de 2 dimensiones
        int[][] testNumbers = {
                {10, 2640},
                {15, 13160},
                {20, 41230},
                {50, 1582700}
        };

        System.out.println(testNumbers[0][0]);

        //--------------------------------------------------------
        //Llenar un array con Scanner

        Scanner sc = new Scanner(System.in);
        int nElementos;

        System.out.println("Digite el numero de elementos del Array");
        nElementos = sc.nextInt();

        String[] datos = new String[nElementos];

        System.out.println(" .Digite los datos del array");
        for (int i = 0; i < nElementos; i++) {
            datos[i] = sc.nextLine();
        }

        System.out.println("Los datos ingresados son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(datos[i]);
        }
    }


}







