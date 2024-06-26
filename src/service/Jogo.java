package service;

import model.Baralho;
import model.Carta;

public class Jogo {
    private Jogador j1;
    private Jogador j2;
    private Baralho baralho;
    public int pontuacaoA;
    public int pontuacaoB;

    public Jogo(Jogador j1, Jogador j2) {
        this.j1 = j1;
        this.j2 = j2;
        this.baralho = new Baralho();
        this.pontuacaoA = 0;
        this.pontuacaoB = 0;
    }

    public boolean alguemGanhou() {
        // Implemente a lógica real para verificar se alguém ganhou
        return pontuacaoA >= 12 || pontuacaoB >= 12;
    }

    public void distribuirCartas() {
        // Implemente a lógica para distribuir as cartas entre os jogadores
        int cartasPorJogador = baralho.cartas.size() / 2;
        for (int i = 0; i < cartasPorJogador; i++) {
            j1.adicionarCarta(baralho.cartas.remove(0));
            j2.adicionarCarta(baralho.cartas.remove(0));
        }
    }

    public boolean alguemPontuou() {
        if (j1.getCartaJogada() == null || j2.getCartaJogada() == null)
            return false;
        if (j1.getCartaJogada().getValor() > j2.getCartaJogada().getValor()) {
            pontuacaoA++; // Jogador 1 pontua
            return true;
        } else if (j2.getCartaJogada().getValor() > j1.getCartaJogada().getValor()) {
            pontuacaoB++; // Jogador 2 pontua
            return true;
        }
        // Empate, ninguém pontua
        return false;
    }

    public void iniciarRodada() {
        // 1. Jogadores escolhem suas cartas (você pode pedir entrada do usuário ou usar
        // lógica interna).
        Carta cartaJogador1 = j1.escolherCartaMaior();
        Carta cartaJogador2 = j2.escolherCartaMaior();

        if (!(cartaJogador1 == null || cartaJogador2 == null)) {
            // 2. Compare as cartas para determinar o vencedor.
            int resultado = cartaJogador1.compararCom(cartaJogador2);
            if (resultado > 0) {
                // Jogador 1 venceu
                pontuacaoA++;
            } else if (resultado < 0) {
                // Jogador 2 venceu
                pontuacaoB++;
            } else {
                // Empate
                System.out.println("Empate!");
            }

        }

    }
}
