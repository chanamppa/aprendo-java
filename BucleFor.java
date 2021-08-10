public class BucleFor {
    static boolean isTurnOnLight = true;

    public static void main(String[] args) {

        isTurnOnOffLight();
        //El for es parecido a un for pero mucho más simplificado
        for (int i = 1; i <= 10; i++) {
            printSos();

        }
    }

    public static void printSos(){
        System.out.println(". . . _ _ . . .");
    }

    public static boolean isTurnOnOffLight() {
        isTurnOnLight = (isTurnOnLight)?true:false;
        return isTurnOnLight;
    }
}
