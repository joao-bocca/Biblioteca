package model;

// Define a classe Carta
public class Carta {
    // Declara os atributos da classe
    private final int numero;
    private final Naipe naipe;
    private int valor;

    // Construtor da classe Carta
    public Carta(int numero, Naipe naipe, int valor) {
        // Inicializa os atributos da classe com os valores fornecidos
        this.numero = numero;
        this.naipe = naipe;
        this.valor = valor;
    }

    // Método getter para obter o valor da carta
    public int getValor() {
        return valor;
    }

    // Método getter para obter o naipe da carta
    public Naipe getNaipe() {
        return naipe;
    }

    // Método getter para obter o número da carta
    public int getNumero() {
        return numero;
    }

    // Sobrescreve o método toString para retornar uma representação em string da carta
    public String toString() {
        // Se o número for 8, retorna "J" seguido do naipe
        if (numero == 8)
            return "J " + naipe.toString();
        // Se o número for 9, retorna "Q" seguido do naipe
        if (numero == 9)
            return "Q " + naipe.toString();
        // Se o número for 10, retorna "K" seguido do naipe
        if (numero == 10)
            return "K " + naipe.toString();
        // Para os demais números, retorna o número seguido do naipe
        return numero + " " + naipe.toString();
    }

    // Método para comparar o valor desta carta com outra carta
    public int compararCom(Carta outraCarta) {
        // Compara os valores das cartas e retorna o resultado
        return Integer.compare(this.valor, outraCarta.valor);
    }
}


