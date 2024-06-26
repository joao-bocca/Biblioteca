package model;

public enum Naipe {
    PAUS((byte) 4, "♣"),
    COPAS((byte) 3, "♥"),
    ESPADAS((byte) 2, "♠"),
    OUROS((byte) 1, "♦");

    private final byte valor;
    private final String simbolo;

    Naipe(byte valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public byte getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}