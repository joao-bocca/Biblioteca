package service;

import java.util.ArrayList;
import java.util.List;

import model.Carta;

public class Jogador {

    private Carta carta = new Carta(0, null, 0);

    private List<Carta> cartas;
    private String nome;
    private Carta cartaJogada;
    private List<Carta> cartasNaMao;

    public Jogador(String nome) {
        this.cartas = new ArrayList<>();
        this.cartasNaMao = new ArrayList<>();
        this.nome = nome;
    }

    public Carta jogarCarta(Carta cartaNaMesa) {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }

    public void exibirCartas() {
        cartas.forEach(carta -> System.out.print(carta + " "));
        System.out.println();
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public String getNome() {
        return nome;
    }

    public void setCartaJogada(Carta carta) {
        this.cartaJogada = carta;
    }

    public Carta getCartaJogada() {
        return cartaJogada;
    }

    public Carta escolherCartaMaior() {
        if (cartasNaMao.isEmpty()) {
            return null; // Ou lance uma exceção, dependendo do seu design
        }
        Carta maiorCarta = cartasNaMao.get(0);
        for (Carta carta : cartasNaMao) {
            if (carta.getValor() > maiorCarta.getValor()) {
                maiorCarta = carta;
            }
        }
        return maiorCarta;
    }
}