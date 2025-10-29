import javax.swing.JOptionPane; // Importa a classe para criar caixas de diálogo interativas com o usuário
import java.util.GregorianCalendar; // Importa a classe para manipular datas com dia, mês e ano

/*
 * Nome: Lucas Souza
 * RA: 248705
 */

public class Agenda {
    public static void main(String[] args) {
        GerenciarAmigo gerenciador = new GerenciarAmigo(); // Instancia o gerenciador que controla os dados dos amigos
        int opcao; // Variável que armazenará a escolha do usuário no menu

        // Loop que mantém o programa em execução até que o usuário escolha sair (opção 5)
        do {
            // Define o texto do menu que será exibido na caixa de diálogo
            String menu = "====== Menu de Opções ======\n" +
                    "1 - Cadastrar Amigo na Agenda\n" +
                    "2 - Buscar Amigo pelo Nome\n" +
                    "3 - Aniversariantes no Mês\n" +
                    "4 - Listar todos os Amigos\n" +
                    "5 - Sair da Agenda\n" +
                    "Escolha uma opção:";

            // Exibe o menu e converte a entrada do usuário para inteiro
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    // Coleta os dados do amigo via caixas de diálogo
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String celular = JOptionPane.showInputDialog("Celular:");
                    String email = JOptionPane.showInputDialog("E-mail:");
                    String rua = JOptionPane.showInputDialog("Rua:");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
                    String complemento = JOptionPane.showInputDialog("Complemento:");
                    String cidade = JOptionPane.showInputDialog("Cidade:");
                    String estado = JOptionPane.showInputDialog("Estado:");
                    String cep = JOptionPane.showInputDialog("CEP:");
                    int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento:"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento:"));
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));

                    // Cria a data de nascimento ajustando o mês (base zero)
                    GregorianCalendar dataNasc = new GregorianCalendar(ano, mes - 1, dia);

                    // Cria o endereço com os dados informados
                    Endereco end = new Endereco(rua, numero, complemento, cidade, estado, cep);

                    // Cria o objeto Amigo com todos os dados coletados
                    Amigo amigo = new Amigo(nome, celular, email, end, dataNasc);

                    // Adiciona o amigo à agenda
                    gerenciador.cadastrarAmigo(amigo);
                    break;

                case 2:
                    // Solicita o nome para busca
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome do amigo:");

                    // Exibe o resultado da busca
                    JOptionPane.showMessageDialog(null, gerenciador.buscarAmigoPeloNome(nomeBusca));
                    break;

                case 3:
                    // Solicita o mês para filtrar aniversariantes
                    int mesBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês (1-12):"));

                    // Exibe os amigos que fazem aniversário no mês informado
                    JOptionPane.showMessageDialog(null, gerenciador.aniversariarNoMes(mesBusca));
                    break;

                case 4:
                    // Exibe todos os amigos cadastrados
                    JOptionPane.showMessageDialog(null, gerenciador.listarTodosAmigos());
                    break;

                case 5:
                    // Mensagem de encerramento do programa
                    JOptionPane.showMessageDialog(null, "Saindo da Agenda...");
                    break;

                default:
                    // Mensagem para opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 5); // Condição para manter o programa em execução
    }
}