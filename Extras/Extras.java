package Extras;

public class Extras {
    public static void main(String[] args) {

        //Detener un bucle
        for (int i = 0; i < 10; i++) {
            if (i == 6){
                break;
            }
            System.out.println(i);
        }

        //Esto es lo mismo que esto
        int numero = 5;

        numero += 10;  //numero = numero + 10

        System.out.println(numero);
    }
}
