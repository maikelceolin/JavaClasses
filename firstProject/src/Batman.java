

/**
 * Personagem
 */
public class Batman {
    String nome = "Batman";
    int forca = 7;
    int nivel = 1;
    int vida = 100;

    void info(){
        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("Força: %d\n", forca);
        System.out.printf("Nivel: %d\n", nivel);
        System.out.printf("Vida: %d\n\n", vida);
    }

    int golpe(int rd){
        int dano = forca * rd;
        return dano;  
    }

}