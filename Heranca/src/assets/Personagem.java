package assets;

public class Personagem { // classe
    // atributos
    private String nome;
    private int vida;
    private int dano;

    // construtor
    public Personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void status() {
        System.out.println(getNome() + " possui " + getVida() + " de vida e " + getDano() + " e de dano");

    }

    // ataque basico
    public void atacar() {
        System.out.println("Ataque básico");
    }

    // ataque duplo
    // utilizando a sobrecarga de métodos
    public void atacar(int dano2) {
        int resultadoDano = dano + dano2;
        System.out.println("Ataque Duplo causou " + resultadoDano + " de dano");
    }

    // metodos get e set

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return int return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

}