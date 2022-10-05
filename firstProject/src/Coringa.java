

public class Coringa {
    String nome = "Coringa";
    int forca = 3;
    int nivel = 1;
    int vida = 100;

    void info(){
        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("Força: %d\n", forca);
        System.out.printf("Nível: %d\n", nivel);
        System.out.printf("Vida: %d\n\n", vida);
    }

    int golpe(int rd){
        int dano = forca * rd;
        return dano;  
    }
}
