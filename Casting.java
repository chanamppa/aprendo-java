public class Casting {
    public static void main(String[] args) {

        //salve 30 perros el año pasado, pero no me acuerdo cuantos por mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //pasando ese resultado double(decimal) a entero
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //ahora lo paso de entero a double
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        //ahora paso un char a int, se pasa automatico
        //porque int es mas grande que char
        //EL 49 equivale a 1 en la tabla ASCII
        char n = '1';
        int nI = n;
        System.out.println(nI);

        //ahora paso char a un short y lo hago yo
        //porque short es mas pequeño que char
        short nS = (short) n;
        System.out.println(nS);
    }
 }
