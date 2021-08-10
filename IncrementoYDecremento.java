public class IncrementoYDecremento {
    public static void main(String[] args) {

        //sumo, resto osea incremento y decremento
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        //decremento
        lives--;
        System.out.println(lives);

        //incremento
        lives++;
        System.out.println(lives);

        int gift = 100 + ++lives;
        System.out.println(gift);

    }
}