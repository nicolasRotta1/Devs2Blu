package Exercicio1;

import java.util.Random;

public class Funcionario {
    private int id;
    private String nome;
    private String ocupacao;
    private double salario;

    public Funcionario(String nome, String ocupacao, double salario) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.salario = salario;
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

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
