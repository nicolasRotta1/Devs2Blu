package ListaExercicios.Computador_Processador.Models;

public class Computador {
    private int id;
    private String nome;
    private String modelo;
    private Processador processador;

    public Computador(int id, String nome, String modelo, Processador processador) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.processador = processador;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
}
