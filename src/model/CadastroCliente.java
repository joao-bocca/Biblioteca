package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private String nomeCliente;
    private long cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private List<CadastroLivro> livrosEmprestados;


    
    public CadastroCliente(String nomeCliente, long cpf, String endereco, LocalDate dataNascimento) {
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

    public long getCpf(){
        return cpf;
    }
    private long toString(long cpf) {
        return toString(cpf);
    }
    public boolean validarCPF(String cpf) {
        
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (CPFs inválidos como 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Cálculo dos dígitos verificadores
        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }
        int resto = 11 - (soma % 11);
        char digito1 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        pesos = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }
        resto = 11 - (soma % 11);
        char digito2 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        // Verifica se os dígitos calculados são iguais aos dígitos do CPF
        return digito1 == cpf.charAt(9) && digito2 == cpf.charAt(10);
    }

    public String getEndereco(){
        return endereco;
    }

    public List<CadastroLivro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(CadastroLivro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(CadastroLivro livro) {
        livrosEmprestados.remove(livro);
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

