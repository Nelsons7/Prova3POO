package assets;

// recebe da classe inimigo um metodo abstrato
// sendo obrigado a deifinir todos os metodos delcarados em Inimigos.java
public class Boots extends Jogador { // aplicando a heranca

    public Boots(String nome, int vida, int dano) {
        super(nome, vida, dano);

    }

    public void animacao() {
        System.out.println("Eu sou o Rei do submundo! ");
    }

    // sobreposicao do metodo atacar da classe pai PERSONAGEM
    public void atacar() {

        System.out.println("Chuva de Ossos ");
    }

    public final void encontrar() { // utilizando o metodo do tipo final
        // atributo final
        final String localizacao = "Profundesas do vale ";
        System.out.println("O " + getNome() + " está localizado em " + localizacao);
    }

}