import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {

        int num; //Creamos la variable tipo entero
        Scanner leer= new Scanner (System.in); //Creamos la clase leer, tipo scanner

        System.out.println("Introduzca 2 números"); //Pedimos un número

        /*Hay que dejar claro, que si la variable fuese por ejemplo tipo "double",
         entonces esta línea debería escribirse así:
          num=leer.nextDouble(); Para que lea un valor tipo Double */
        num = leer.nextInt(); //Lo leemos y asignamos a la variable num


        //Se muestra el número introducido
        System.out.println("El número que has introducido es " + num);


    }
}
