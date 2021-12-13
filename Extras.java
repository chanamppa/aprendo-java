public class Extras {
    public static void main(String[] args) {
        String [] autos = {"Bmw", "Ford", "Toyota"};
        //Así se utiliza un foreach
        for (String i: autos) {
            System.out.println(i);
        }

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
