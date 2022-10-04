import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Prazer em conhecê-lo, qual seu nome: ");
        String nome = scan.nextLine();

        Pessoa individuo = new Pessoa();

        individuo.nome = nome;
        System.out.format("Olá %s, como está?\n", individuo.nome);
        
        String ans = scan.nextLine();
        if (ans.equals("bem")) {
            System.out.println("Que bom!\n");
        } else {
            System.out.println("Ah, que pena!");
        }
        System.out.println("Quantos anos voce tem? ");
        int idade = scan.nextInt();
        int nasc = 2022 - idade;
        System.out.format("Obrigado %s, descobri que você nasceu em %d !", nome, nasc);
    }
}   