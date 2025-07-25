package ListaExercicios.Professor_Disciplina.Models;

public class Disciplina {
    private int id;
    private String nome;
    private String cargaHoraria;
    private static int ContadorId;

    public Disciplina(String nome, String cargaHoraria) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
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

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
