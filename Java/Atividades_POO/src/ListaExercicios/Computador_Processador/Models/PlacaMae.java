package ListaExercicios.Computador_Processador.Models;

public class PlacaMae {
    private int id;
    private String nome;
    private static int ContadorId;

    public PlacaMae(String nome) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
