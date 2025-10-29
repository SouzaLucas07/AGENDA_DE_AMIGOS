import java.util.Calendar;              // Importa a classe base para manipulação de datas e horários
import java.util.GregorianCalendar;     // Importa a implementação mais comum de calendário

public class Amigo {
    // Atributos privados que armazenam os dados do amigo
    private String nome;
    private String celular;
    private String email;
    private Endereco endereco;
    private GregorianCalendar dataNascimento;

    // Construtor padrão (sem parâmetros)
    public Amigo() {}

    // Construtor completo que inicializa todos os atributos com os valores fornecidos
    public Amigo(String nome, String celular, String email, Endereco endereco, GregorianCalendar dataNascimento) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public GregorianCalendar getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(GregorianCalendar dataNascimento) { this.dataNascimento = dataNascimento; }

    // Metodo que retorna uma string formatada com todos os dados do amigo
    public String imprimir() {
        return "Nome: " + nome +
                "\nCelular: " + celular +
                "\nEmail: " + email +
                "\nData de Nascimento: " +
                dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" +
                (dataNascimento.get(Calendar.MONTH) + 1) + "/" +
                dataNascimento.get(Calendar.YEAR) +
                "\n" + endereco.imprimir(); // Chama o metodo imprimir() da classe Endereco
    }

    // Metodo que calcula quantos dias faltam (ou passaram) para o aniversário do amigo
    public String calcularDiasParaAniversariar() {
        Calendar hoje = Calendar.getInstance(); // Obtém a data atual

        // Cria uma nova data de aniversário para o ano atual
        Calendar aniversario = new GregorianCalendar(
                hoje.get(Calendar.YEAR),
                dataNascimento.get(Calendar.MONTH),
                dataNascimento.get(Calendar.DAY_OF_MONTH)
        );

        // Calcula a diferença em milissegundos entre hoje e o aniversário
        long diferenca = aniversario.getTimeInMillis() - hoje.getTimeInMillis();
        long dias = diferenca / (24 * 60 * 60 * 1000); // Converte milissegundos em dias

        // Retorna uma mensagem personalizada com base na diferença de dias
        if (dias == 0)
            return "Hoje é o aniversário de " + nome + "!";
        else if (dias > 0)
            return "Faltam " + dias + " dias para o aniversário de " + nome;
        else
            return "Passaram " + Math.abs(dias) + " dias do aniversário de " + nome;
    }
}