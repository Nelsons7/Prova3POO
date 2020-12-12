package assets;

// classe abstrata inimigo

public abstract class Inimigo {
    // super
    public Inimigo(String nome, int vida, int dano) {

    }

    public abstract void animacao();

    public abstract void atacar();

}