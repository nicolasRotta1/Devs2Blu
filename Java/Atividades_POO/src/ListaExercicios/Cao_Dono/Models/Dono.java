package ListaExercicios.Cao_Dono.Models;

public class Dono {
    private int id;
    private String nome;
    private String cpf;
    private static int ContadorId;

    public Dono( String nome, String cpf) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.cpf = cpf;
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
}
