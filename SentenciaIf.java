public class SentenciaIf {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;


        //este "if" va hacer que sume un archivo y diga algo si la condición es true
        if (isBluetoothEnabled){
            fileSended ++;
            System.out.println("Archivo Enviado");
            System.out.println(fileSended);
        }else{   //este else sirve solo si no se cumple la condicion, es un "si no"

            System.out.println("Por favor, enciende el Bluetooth");
        }


    }


}
