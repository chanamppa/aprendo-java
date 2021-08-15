public class Arrays {
    public static void main(String[] args) {
        //(esto es un array) 17 son las versiones que existen de Android, new es para llamar a un objeto.
        //son arrays de 1 dimensión, (de las dos formas se pueden declarar arrays)

        String[] androidVersions = new String[17];
        int days[] = new int[7];

        //Array de 2 dimensiones
        String[][] cities = new String[3][2];
        /*  1             2
        Argentina  Estados Unidos
       2- 1 -BsAs      -Washington DC
       1- 2 -Cordoba   -Minnesota
       0- 3 -San Juan  -Florida
                0           1
         */

        //el .length significa que va a recorrer toda la longitud de ese array
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        //Array de 3 dimesiones
        int[][][] numbers = new int[2][2][2];

        //Los numero son en las posiciones que se encuentran
        //Declarando los valores del array
        cities[0][0] = "San Juan";
        cities[0][1] = "Florida";
        cities[1][0] = "Cordoba";
        cities[1][1] = "Minnesota";
        cities[2][0] = "BSAS";
        cities[2][1] = "Washington DC";

        //llamamos un for para disminuir el codigo
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

        }


        }







