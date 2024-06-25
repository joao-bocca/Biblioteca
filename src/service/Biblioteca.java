package service;

import java.util.ArrayList;
import java.util.List;

import model.CadastroCliente;
import model.CadastroLivro;

public class Biblioteca {
    private List<CadastroLivro> acervo;
    private List<CadastroCliente> clientes;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Métodos para adicionar livros e clientes
    public void adicionarLivro(CadastroLivro acervo) {
        acervo.add(acervo);
    }

    public void adicionarCliente(CadastroCliente cliente) {
        clientes.add(cliente);
    }

    public void listarLivros() {
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca não tem livros disponíveis no momento.");
        } else {
            System.out.println("Lista de livros disponíveis:");
            for (CadastroLivro livro : acervo) {
                System.out.println(livro);
            }
        }

    }
}