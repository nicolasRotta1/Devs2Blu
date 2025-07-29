package ListaExercicios.Professor_Disciplina.Models;

public class Professor {
    private int id;
    private String nome;
    private  Disciplina disciplina;
    private SalaDeAula salaDeAula;
    private static int ContadorId;

    public Professor(String nome, Disciplina disciplina) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.disciplina = disciplina;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public SalaDeAula getSalaDeAula() {
        return salaDeAula;
    }

    public void setSalaDeAula(SalaDeAula salaDeAula) {
        this.salaDeAula = salaDeAula;
    }
}
