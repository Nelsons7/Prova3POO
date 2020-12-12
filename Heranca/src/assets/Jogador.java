package assets;

public class Jogador extends Personagem { // aplicando a heranca

    // super
    public Jogador(String nome, int vida, int dano) {
        super(nome, vida, dano);

    }

    // sobreposicao do metodo atacar da classe pai PERSONAGEM
    public void atacar() {
        super.status(); // super em outra classe sem ser o contrutor
        System.out.println("Espada de fogo \n");
    }

}