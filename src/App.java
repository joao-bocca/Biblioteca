import java.util.Scanner;
import model.CadastroCliente;
import model.CadastroLivro;
import service.InteracaoUsuario;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        apresentacaoParaUsuario(scanner);
        scanner.close();
    }

    public static void apresentacaoParaUsuario(Scanner scanner) {
        InteracaoUsuario interacaoUsuario = new InteracaoUsuario(scanner);

        boolean continuar = true;
        while (continuar) {
            // Captura a escolha do usuário
            int opcao = InteracaoUsuario.escolhaMenu(scanner);
            scanner.nextLine(); // Captura a nova linha após nextInt para evitar problemas de leitura

            // Executa a ação com base na opção escolhida
            switch (opcao) {
                case 1 :
                    CadastroLivro[] exemplosLivros = CadastroLivro.getExemplosLivros();
                    System.out.println("Exemplos de livros da biblioteca:");
                    for (CadastroLivro livro : exemplosLivros) {
                        System.out.println(livro.toString());
                    
                }
                break;
                case 2 :
                    interacaoUsuario.requisitarDadosCliente(scanner, null);
                    break;
                
                default :
                    continuar = false;
                    System.out.println("Opção inválida. Saindo do programa.");
                }
            }

            if (continuar) {
                // Espera o usuário pressionar Enter para voltar ao menu
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine(); // Espera o Enter
            }
        }
    }

