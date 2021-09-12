import java.util.Scanner;

public class Learningg {
    public static void main(String[] args) {

        //Acá estoy comparando 2 cadenas
        String cadena1 = "LAUTARO";
        String cadena2 = "lautaro";

        //Las comparo con el equals, y ese ignoreCase sirve para comparar sin importarle las mayúsculas y minúsculas
        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }

        //Acá también comparo 2 cadenas, solo que con un scanner, para que el usuario ponga las palabras.
        Scanner leer = new Scanner(System.in);
        String comparar1;
        String comparar2;

        System.out.println("Ingresa una palabra cualquiera");
        comparar1 = leer.nextLine();

        System.out.println("Ingresa otra palabra");
        comparar2 = leer.nextLine();

        if (comparar1.equalsIgnoreCase(comparar2)){
            System.out.println("Son palabras iguales boludo");
        }else{
            System.out.println("Linda elección de palabras :)");
        }
    }
}
