public class OperacionesMatematicas {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //usando "Math." hago operaciones matemáticas
        //redondea hacia arriba
        System.out.println(Math.ceil(x));

        //redondea hacia abajo
        System.out.println(Math.floor(x));

        //devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //devuelve el número mayor
        System.out.println(Math.max(x,y));

        ///devuelve la raíz cuadrada, puse ese "int" porque estoy pasando ese double a numero entero
        System.out.println((int) Math.sqrt(y));

        //area de un circulo (pi * r2)
        System.out.println((int)Math.PI * Math.pow(y,2));

        //volumen de una esfera  (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}
