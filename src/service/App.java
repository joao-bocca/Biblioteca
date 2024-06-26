package service;

import model.Baralho;

public class App {

    public static void main(String[] args) {
        InteracaoUsuario interacaoUsuario = new InteracaoUsuario();
        Baralho baralho = new Baralho();
        Jogador j1 = new Jogador("Pedro");
        Jogador j2 = new Jogador("Romário");
        Jogo jogo = new Jogo(j1, j2);
        

        while (!jogo.alguemGanhou()) {
            baralho.embaralhar();
            jogo.distribuirCartas();
            while (!jogo.alguemPontuou()) {
                jogo.iniciarRodada();
            }
            interacaoUsuario.exibirPlacar(j1.getNome(), jogo.pontuacaoA, j2.getNome(), jogo.pontuacaoB);
        }
    }
}