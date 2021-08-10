public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        //Operadores de Equidad
        System.out.println("a es igual a b -> " + (a == b));
        System.out.println("a no es igual a b -> " + (a != b));

        //Operadores Racionales
        System.out.println("a es mayor a b -> " + (a > b));
        System.out.println("a es menor a b -> " + (a < b));

        // lo de acá estoy comprobando con if´s
        //solo se cumple lo verdadero
        if (a == b){
            System.out.println("a es igual a b");
        }else if ((a != b) && (a > b) ){   //en este caso estoy comprobando los dos datos que son verdaderos
            System.out.println("a es no es igual a b y es mayor a b");
        }else if (a > b){
            System.out.println("a es es mayor a b");
        }else if (a < b){
            System.out.println("a es es menor a b");
        }

    }
}
