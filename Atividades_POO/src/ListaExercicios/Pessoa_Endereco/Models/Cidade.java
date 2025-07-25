package ListaExercicios.Pessoa_Endereco.Models;

public class Cidade {
    private int id;
    private String nome;
    private String estado;
    private static int ContadorId;

    public Cidade(String nome, String estado) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getContadorId() {
        return ContadorId;
    }

    public static void setContadorId(int contadorId) {
        ContadorId = contadorId;
    }
}
