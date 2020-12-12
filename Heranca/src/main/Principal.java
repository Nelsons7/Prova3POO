package main;

import assets.ChefeSupremo;
import assets.Boots;
import assets.Inimigo;
import assets.Jogador;

public class Principal {
    public static void main(String[] args) {

        // Jogador
        System.out.println("############ JOGADOR ###########");

        Jogador jogador = new Jogador("Yosen", 50, 8);
        jogador.atacar(2);
        jogador.status();

        System.out.println("\n");

        // inimigo (boot)
        System.out.println("############ INIMIGO ###########");

        Boots boots = new Boots("Esqueleton", 20, 5);
        boots.animacao();
        boots.atacar(); // se passar um valor como parametro irá atacar duas vezes
        boots.encontrar();
        // boots.econtrar();

        System.out.println("\n");

        // chefe supremo (boss final)
        System.out.println("############ BOSS FINAL ###########");

        ChefeSupremo chefeSupremo = new ChefeSupremo("Childe", 150, 13);
        chefeSupremo.status();
        chefeSupremo.atacar();

        System.out.println("\n");
    }
}