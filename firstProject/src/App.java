import java.util.Random;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Batman player1 = new Batman();
        Coringa player2 = new Coringa();

        player1.info();
        player2.info();

        do {
            Random x = new Random();
            int rd = 1 + x.nextInt(6);
            int dano = player1.golpe(rd);
            player2.vida = player2.vida - dano;
            if (player2.vida < 0){
                player2.vida = 0;
            }
            player2.info();

        } while (player2.vida > 0);
    }
}