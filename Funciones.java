import com.sun.org.apache.xml.internal.resolver.readers.CatalogReader;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //area de un circulo (pi * r2)
        circleArea(y);
        System.out.println(circleArea(y));

        //Acá estoy imprimiendo el  resultado de la funcion de convertir moneda
        System.out.println("Pesos a Dolares " + convertToDolar(100, "ARS"));

    }
    /**
     * Descripción: Calcula el área de un circulo
     *
     * @param r es el radio y nombre
     * @return devuelve la operacion matematica
     * */
    public static double circleArea(double r){  //r es el nombre

        return Math.PI * Math.pow (r,2);
    }
    /**
     * Descripción: Cambia una moneda a dolar
     *
     * @param cantidad Cantidad de dinero
     * @param moneda Tipo de moneda: en este caso son ARS Y MXN
     * @return devuelve la cantidad en dolares
     * */
    public static double convertToDolar(double cantidad, String moneda){
        switch (moneda){
            case "ARS":
                cantidad = cantidad * 0.010;
                break;
            case "MXN":
                cantidad = cantidad * 0.050;
                break;
        }
        return cantidad;
    }

}
