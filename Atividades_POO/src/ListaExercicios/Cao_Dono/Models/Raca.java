package ListaExercicios.Cao_Dono.Models;

public class Raca {
    private int id;
    private String nome;
    private String origem;
    private static int ContadorId;

    public Raca(String nome, String origem) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.origem = origem;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
