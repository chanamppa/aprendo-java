public class FuncionMejorado {
    public static void main(String[] args) {
        saludo(); /*De esta forma, cada vez que quisieramos escribir el "Hola Mundo",
                    nos bastaría con llamar a la función, y no lo tendríamos que hacer varias veces.
                    Esa es la idea de las funciones.*/

        int num = 8;
        numerito(num);

        int n1 = 9;
        int n2 = 6;
        System.out.println("El resultado es " + suma(n1, n2));
    }
    //Función que no recibe datos y no devuelve nada
    public static void saludo(){
        System.out.println("Hola mundo");
    }

    //Función que recibe datos y no devuelve nada
    public static void numerito(int numero){
        System.out.println("El numero es "+ numero);
    }

    //Función que recibe datos y devuelven datos
    public static int suma(int num1, int num2){
        int resultado= num1 + num2;

        return resultado;
    }
}
