public class Whilee {
    //es static por el metodo main, ya que el metodo main tiene que ser static porque es lo principal
    static boolean isTurnOnLight = false;

    /**
     * Descripción: estoy haciendo un sistema SOS, donde imprima ese sistema 20 veces.
     **/
    public static void main(String[] args) {

        isTurnOnOffLight();

        //Acá esta el while, que dice: mientras esto sea verdadero se va a imprimir, hasta que sea falso.
        int i = 0;
        while (isTurnOnLight && i<=20){
            printSos();
            i++;
        }


    }

    //es void porque no devuelve nada, solo un sysout
    public static void printSos(){
        System.out.println(". . . _ _ . . .");
    }

    public static boolean isTurnOnOffLight() {
        //este es el operador ternario, es como un if (si la condicion se cumple devuelve el valor true, si no devuelve false)
         isTurnOnLight = (isTurnOnLight)?true:false;
        return isTurnOnLight;
    }

}
