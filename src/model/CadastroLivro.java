package model;

import java.util.List;

public class CadastroLivro {
    private String nomeLivro;
    private double preco;
    private int codigo;
    private boolean emprestado;
    CadastroCliente cadastroCliente = new CadastroCliente(nomeLivro, codigo, nomeLivro, null);
    private CadastroLivro[] livrosEmprestados;

    // Construtor para inicializar o nome, preço e código do produto
    public CadastroLivro(String nomeLivro, double preco, int codigo) {
        this.nomeLivro = nomeLivro;
        this.preco = preco;
        this.codigo = codigo;
        this.emprestado = false;
    }



    // Método getter para obter o nome do produto
    public String getNomeLivro() {
        return nomeLivro;
    }

    // Método getter para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método getter para obter o código do produto
    public int getCodigo() {
        return codigo;
    }

    // Método getter para verificar se o produto está emprestado
    public boolean isEmprestado() {
        return emprestado;
    }

    // Método setter para definir se o produto está emprestado
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public List<CadastroLivro> getLivrosEmprestados() {
        return getLivrosEmprestados();
    }

    // Método toString para retornar a representação em string do produto
    @Override
    public String toString() {
        return
                "Nome = '" + nomeLivro + "\n" +
                "Preco = " + preco + "\n" +
                "Codigo = " + codigo + "\n" +
                 "Emprestado = " + emprestado ;
    }

    // Método para obter exemplos de livros
    public static CadastroLivro[] getExemplosLivros() {
        CadastroLivro livro1 = new CadastroLivro("Dom Quixote", 45, 1);
        CadastroLivro livro2 = new CadastroLivro("A Arte da Guerra", 30.5, 2);
        CadastroLivro livro3 = new CadastroLivro("1984", 25.75, 3);

        return new CadastroLivro[]{livro1, livro2, livro3};
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + cadastroCliente.getNomeCliente() + ":");
        for (CadastroLivro livro : livrosEmprestados) {
            System.out.println(livro.getNomeLivro());
        }
    }



    public void add(CadastroLivro acervo) {
        return;
    }

    




    
}
