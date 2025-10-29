public class Endereco {
    // Atributos privados que representam os dados de um endereço
    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    // Construtor padrão (sem parâmetros), útil para criar objetos vazios
    public Endereco() {}

    // Construtor completo que inicializa todos os atributos com os valores recebidos
    public Endereco(String rua, int numero, String complemento, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    // Metodo que retorna uma string formatada com todos os dados do endereço
    public String imprimir() {
        return "Endereço: " + rua + ", " + numero + " - " + complemento +
                "\nCidade: " + cidade + " - " + estado +
                "\nCEP: " + cep;
    }
}