package ListaExercicios.Computador_Processador.Models;

public class PlacaMae {
    private int id;
    private String nome;

    public PlacaMae(int id, String nome) {
        this.id = id;
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
