import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.printf("\nOlá %s, como vai?\n", nome);
    }   
    // the difference beetween print and println is the line
}
