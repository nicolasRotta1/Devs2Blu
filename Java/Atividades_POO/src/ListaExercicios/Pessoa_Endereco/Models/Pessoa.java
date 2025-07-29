package ListaExercicios.Pessoa_Endereco.Models;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private static int ContadorId;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;


    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
