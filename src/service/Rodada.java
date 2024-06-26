package service;

import model.Carta;

public class Rodada {
    Carta carta = new Carta(0, null, 0);
    
    public Carta cartaJogadorUm;
    public Carta cartaJogadorDois;
    public int ganhador;

    // Construtor padrão vazio
    public Rodada() {
    }
}
