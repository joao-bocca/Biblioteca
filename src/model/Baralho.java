package model;

// Importa as classes necessárias do pacote java.util
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define a classe Baralho
public class Baralho {

    // Declara uma lista pública de objetos Carta chamada 'cartas'
    public List<Carta> cartas = new ArrayList<>();

    // Construtor da classe Baralho
    public Baralho() {
        // Adiciona todas as cartas ao baralho. Para cada naipe (PAUS, COPAS, ESPADAS, OUROS),
        // são adicionadas as cartas de 1 a 10 com os valores apropriados
        this.cartas.addAll(List.of(new Carta(1, Naipe.PAUS, 11),
                new Carta(2, Naipe.PAUS, 12),
                new Carta(3, Naipe.PAUS, 13),
                new Carta(4, Naipe.PAUS, 4),
                new Carta(5, Naipe.PAUS, 5),
                new Carta(6, Naipe.PAUS, 6),
                new Carta(7, Naipe.PAUS, 7),
                new Carta(8, Naipe.PAUS, 8),
                new Carta(9, Naipe.PAUS, 9),
                new Carta(10, Naipe.PAUS, 10),
                new Carta(1, Naipe.COPAS, 11),
                new Carta(2, Naipe.COPAS, 12),
                new Carta(3, Naipe.COPAS, 13),
                new Carta(4, Naipe.COPAS, 4),
                new Carta(5, Naipe.COPAS, 5),
                new Carta(6, Naipe.COPAS, 6),
                new Carta(7, Naipe.COPAS, 7),
                new Carta(8, Naipe.COPAS, 8),
                new Carta(9, Naipe.COPAS, 9),
                new Carta(10, Naipe.COPAS, 0),
                new Carta(1, Naipe.ESPADAS, 11),
                new Carta(2, Naipe.ESPADAS, 12),
                new Carta(3, Naipe.ESPADAS, 13),
                new Carta(4, Naipe.ESPADAS, 4),
                new Carta(5, Naipe.ESPADAS, 5),
                new Carta(6, Naipe.ESPADAS, 6),
                new Carta(7, Naipe.ESPADAS, 7),
                new Carta(8, Naipe.ESPADAS, 8),
                new Carta(9, Naipe.ESPADAS, 9),
                new Carta(10, Naipe.ESPADAS, 10),
                new Carta(1, Naipe.OUROS, 11),
                new Carta(2, Naipe.OUROS, 12),
                new Carta(3, Naipe.OUROS, 13),
                new Carta(4, Naipe.OUROS, 4),
                new Carta(5, Naipe.OUROS, 5),
                new Carta(6, Naipe.OUROS, 6),
                new Carta(7, Naipe.OUROS, 7),
                new Carta(8, Naipe.OUROS, 8),
                new Carta(9, Naipe.OUROS, 9),
                new Carta(10, Naipe.OUROS, 10)));
    }

    // Método público para embaralhar as cartas do baralho
    public void embaralhar() {
        // Usa o método shuffle da classe Collections para embaralhar a lista de cartas
        Collections.shuffle(cartas);
    }
}