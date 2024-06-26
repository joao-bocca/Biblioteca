package service;

import model.Carta;

public class InteracaoUsuario {
    private static final String MENSAGEM_EMBARALHANDO = "Embaralhando...";
    private static final String FORMATO_PLACAR = "%s: %d || %s: %d%n";
    private static final String FORMATO_CARTA_JOGADA = "%s jogou %s%n";
    private static final String FORMATO_VENCEDOR_RODADA = ">>>>>>>> %s venceu%n";
    private static final String MENSAGEM_EMBUCHOU = ">>>>>>>>>>> embuchou%n";
    private static final String DIVISOR = "=========================================";
    private static final String FORMATO_CARTA_VIRADA = "<< Virou %s >>%n";

    private static void aguardar(int milissegundos) {
        // Implementação do método aguardar (se necessário)
    }

    public static void exibirMensagemEmbaralhando() {
        aguardar(100);
        System.out.println(MENSAGEM_EMBARALHANDO);
    }

    public void exibirPlacar(String nome1, int pontos1, String nome2, int pontos2) {
        aguardar(1000);
        exibirDivisor();
        System.out.printf(FORMATO_PLACAR, nome1, pontos1, nome2, pontos2);
        exibirDivisor();
    }

    public static void exibirCartaJogada(String nome, Carta carta) {
        aguardar(2000);
        System.out.printf(FORMATO_CARTA_JOGADA, nome, carta);
    }

    public static void exibirVencedorRodada(int ganhador, Jogador jogador1, Jogador jogador2) {
        aguardar(1000);
        if (ganhador != 0) {
            String nomeVencedor = (ganhador == 1) ? jogador1.getNome() : jogador2.getNome();
            System.out.printf(FORMATO_VENCEDOR_RODADA, nomeVencedor);
        } else {
            System.out.println(MENSAGEM_EMBUCHOU);
        }
    }

    public static void exibirDivisor() {
        System.out.println(DIVISOR);
    }

    public static void exibirCartaVirada(Carta carta) {
        aguardar(500);
        System.out.printf(FORMATO_CARTA_VIRADA, carta);
    }
}