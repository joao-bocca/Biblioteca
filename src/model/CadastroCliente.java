package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private String nomeCliente;
    private int cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private List<CadastroLivro> livrosEmprestados;


    
    public CadastroCliente(String nomeCliente, int cpf, String endereco, LocalDate dataNascimento) {
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Método getter para obter o nome do produto
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método getter para obter o preço do produto
    public LocalDate getDataDeNascimento() {
        return dataNascimento;
    }

    public int getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public List<CadastroLivro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void removerLivro(CadastroLivro acervo) {
        livrosEmprestados.remove(acervo);
    }

    // Método toString para retornar a representação em string 
    public String toStringCliente() {
        return "Cliente{" +
                "nome='" + nomeCliente + '\'' +
                ", data de nascimento =" + dataNascimento + '\'' +
                ", cpf =" + cpf + '\'' +
                ", endereço =" + endereco + '\'' +
                '}';
    }
}

