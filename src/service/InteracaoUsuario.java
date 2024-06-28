package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import model.CadastroCliente;
import model.CadastroLivro;


public class InteracaoUsuario {

    CadastroCliente cliente;
    CadastroLivro acervo;
    Scanner scanner;

    public InteracaoUsuario(Scanner scanner) {
        this.scanner = scanner;
    }

    public static int escolhaMenu(Scanner scanner) {
        System.out.println("\n" +
                "1- Lista de livros\n" +
                "2- Cadastro de leitores\n" +
                "3- Devolução\n" +
                "4- Pedido de empréstimo\n");

        return scanner.nextInt();
    }

    public static  void Meses(Scanner scanner) {
        System.out.println("\n" +
                "Janeiro\n" +
                "Fevereiro\n" +
                "Março\n" +
                "Abril\n" +
                "Maio\n" +
                "Junho\n" +
                "Julho\n" +
                "Agosto\n" +
                "Setembro\n" +
                "Outubro\n" +
                "Novembro\n" +
                "Dezembro\n");
    }

    public List<CadastroCliente> requisitarDadosCliente(Scanner leitor, List<CadastroCliente> clientes) {
        System.out.println("Informe seu nome:");
        String nomeCliente = leitor.nextLine();

        System.out.println("Informe o dia que você nasceu:");
        int diaDeNascimento = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe o mês que você nasceu:");
        int mesDeNascimento = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe o ano que você nasceu:");
        int anoDeNascimento = Integer.parseInt(leitor.nextLine());

        LocalDate dataNascimento = LocalDate.of(anoDeNascimento, mesDeNascimento, diaDeNascimento);

        System.out.println("Informe o CPF:");
        long cpf = Long.valueOf(leitor.nextLine());

        System.out.println("Informe o endereço:");
        String endereco = leitor.nextLine();

        cliente = new CadastroCliente(nomeCliente, cpf, endereco, dataNascimento);
        clientes.add(cliente);

        return clientes;
    }
    CadastroCliente cadastroCliente = new CadastroCliente(null, 0, null, null);
    public void emprestarLivro(CadastroCliente cliente, CadastroLivro acervo, Biblioteca biblioteca, Scanner leitor, long cpf) {
        System.out.println("Informe o CPF do cliente:");
        String cpfvalidacao = leitor.nextLine();
        cadastroCliente.validarCPF(cpfvalidacao);
        System.out.println("Informe o código do livro:");
        int codigoLivro = Integer.parseInt(scanner.nextLine());
        if (acervo.isEmprestado()) {
            System.out.println("Este livro já está emprestado.");
        } else {
            biblioteca.adicionarLivro(acervo);
            acervo.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso para " + cliente.getNomeCliente());
        }
    }


    private long toString(long cpf) {
        return toString(cpf);
    }

    public void devolverLivro(CadastroCliente cliente, CadastroLivro acervo) {
        if (cliente.getLivrosEmprestados().contains(acervo)) {
            cliente.removerLivro(acervo);
            acervo.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso por " + cliente.getNomeCliente());
        } else {
            System.out.println("Este livro não foi emprestado por " + cliente.getNomeCliente());
        }
    }

    
}
