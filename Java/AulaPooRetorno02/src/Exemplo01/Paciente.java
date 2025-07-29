package Exemplo01;

import java.util.Random;

public class Paciente {
    private int id;
    private String nome;
    private String dataNascimento;


    public Paciente(String nome, String dataNascimento) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
