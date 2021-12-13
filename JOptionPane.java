
//El jOptionPane es una entrada y salida de datos, es como la consola pero más gráfico
public class JOptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char caracter;
        double decimal;

        //Asi se hace
        cadena = javax.swing.JOptionPane.showInputDialog("Digita una cadena: ");
        //Con los tipos numericos, se les agregra el "envolotorio o wrapper" ej: Integer y el parse...
        entero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite un numero: "));
        // con el caracter es así
        caracter = javax.swing.JOptionPane.showInputDialog("Digite sola una letra: ").charAt(0);
        decimal = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite un decimal: "));

        //Así se imprime
        javax.swing.JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
        javax.swing.JOptionPane.showMessageDialog(null, "El numero es: "+entero);
        javax.swing.JOptionPane.showMessageDialog(null, "El caracter es: "+caracter);
        javax.swing.JOptionPane.showMessageDialog(null, "el decimal es : "+decimal);

    }
}
