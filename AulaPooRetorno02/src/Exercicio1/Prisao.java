package Exercicio1;

import java.util.List;
import java.util.Random;

public class Prisao {
    private int id;
    private String nome;
    private String local;
    private int capacidade;
    private List<Funcionario> funcionario;
    private List<Presidiario> presiario;

    public Prisao(){
        this.id = new Random().nextInt(1000);
    }

    public Prisao(String nome, String local, int capacidade){
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public List<Presidiario> getPresiario() {
        return presiario;
    }

    public void setPresiario(List<Presidiario> presiario) {
        this.presiario = presiario;
    }
}
