public class SwitchStatement {
    public static void main(String[] args) {

        //creo una variable con el color que tengo
        String colorModeSelected = "Dark";

        //evaluo con switch las diferentes opciones
        switch (colorModeSelected){
            case "Light":
                System.out.println("Elegiste Light mode");
                break;
            case "Blue Dark":
                System.out.println("Elegiste Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Elegiste el Dark mode");
                break;
            default:  //Este default sirve por si ninguna de las opciones se utiliza o no encaja
                System.out.println("Elegí una opción");


        }

    }
}
