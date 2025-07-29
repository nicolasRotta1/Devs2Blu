package ListaExercicios.Pessoa_Endereco.Models;

public class Endereco {
    private int id;
    private String cep;
    private Cidade cidade;
    private String bairro;
    private String rua;
    private int numero;
    private static int ContadorId;

    public Endereco(String cep, Cidade cidade, String bairro, String rua, int numero) {
        ContadorId++;
        this.id = ContadorId;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

