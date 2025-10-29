import java.util.ArrayList;              // Importa a classe para criar listas dinâmicas
import java.util.GregorianCalendar;      // Importa a classe para manipular datas
import javax.swing.JOptionPane;          // Importa a classe para exibir caixas de diálogo

public class GerenciarAmigo {
    // Lista que armazena todos os objetos do tipo Amigo
    private ArrayList<Amigo> listaAmigos = new ArrayList<>();

    // Método para cadastrar um novo amigo na lista
    public void cadastrarAmigo(Amigo a) {
        listaAmigos.add(a); // Adiciona o amigo à lista
        JOptionPane.showMessageDialog(null, "Amigo cadastrado com sucesso!"); // Confirmação visual
    }

    // Método para buscar um amigo pelo nome (ignora maiúsculas/minúsculas)
    public String buscarAmigoPeloNome(String nome) {
        for (Amigo a : listaAmigos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                // Retorna os dados do amigo e os dias para o aniversário
                return a.imprimir() + "\n" + a.calcularDiasParaAniversariar();
            }
        }
        return "Amigo não encontrado!"; // Caso nenhum nome coincida
    }

    // Método que retorna os amigos que fazem aniversário no mês informado
    public String aniversariarNoMes(int mes) {
        if (mes < 1 || mes > 12) return "Mês inválido!"; // Validação do mês

        StringBuilder sb = new StringBuilder("Aniversariantes do mês " + mes + ":\n");
        boolean encontrou = false;

        for (Amigo a : listaAmigos) {
            // Compara o mês da data de nascimento (lembrando que é zero-based)
            if (a.getDataNascimento().get(GregorianCalendar.MONTH) + 1 == mes) {
                sb.append(a.getNome()).append("\n");
                encontrou = true;
            }
        }

        // Retorna a lista ou uma mensagem caso não haja aniversariantes
        return encontrou ? sb.toString() : "Nenhum amigo faz aniversário neste mês.";
    }

    // Método que lista todos os amigos cadastrados
    public String listarTodosAmigos() {
        if (listaAmigos.isEmpty()) return "Nenhum amigo cadastrado!"; // Verifica se a lista está vazia

        StringBuilder sb = new StringBuilder("=== Lista de Amigos ===\n");
        for (Amigo a : listaAmigos) {
            sb.append(a.imprimir()).append("\n---------------------\n"); // Adiciona separador entre amigos
        }
        return sb.toString(); // Retorna a lista formatada
    }
}