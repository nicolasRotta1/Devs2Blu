package ListaExercicios.Carro_Proprietario;

import java.util.Random;

public class Proprietario {
    private int id;
    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        this.id = new Random().nextInt(1000);
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
