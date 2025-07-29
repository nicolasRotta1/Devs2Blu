package ListaExercicios.Professor_Disciplina.Models;

public class SalaDeAula {
    private int id;
    private  String nome;
    private int capacidade;
    private static int ContadorId;

    public SalaDeAula(String nome, int capacidade) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
