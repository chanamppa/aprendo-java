public class PromedioAlumnos {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 10;
        int nota3 = 4;

        int promedio = nota1 + nota2 + nota3;
        promedio = promedio /3;

        if (promedio > 6){
            System.out.println("Aprobado con " + promedio);
        }else{
            System.out.println("Desaprobado");
        }
    }
}
