public class Variables {
    static int dias = 7; //Así se declaran variables globales
    public static void main(String[] args) {
        //Declarando una Variable
        int speed;
        //Asignamos un valor a una variable
        speed = 10;
        System.out.println(speed);

        //Haciendo variables e imprimiendo su valor
        int salary = 600;
        String employeeName ="Juan Delgado";

        //Le sumo $200 al salario
        salary = salary + 200;

        //trabajo 2 horas extras ($30 la hora) y tambien gasto $50 en comida
        salary = salary + (30*2) - 50;
        System.out.println(salary);

        //Actualizo el nombre del vago(Muchacho)
        employeeName = employeeName + " Olivares";
        employeeName = "Roque " + employeeName;

        employeeName = employeeName + 9;
        System.out.println("El empleado " + employeeName + " Gana: " + salary + " por mes");

        //estas son CONSTANTES
        int POSITION = 10;
        int THE_POSITION = 15;

    }
}
