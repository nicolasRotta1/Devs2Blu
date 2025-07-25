package ListaExercicios.Cao_Dono.Models;

public class Cachorro {
    private int id;
    private String nome;
    private Raca raca;
    private Dono dono;
    private static int ContadorId;

    public Cachorro(String nome) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
    }

    public Cachorro(String nome, Raca raca, Dono dono) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
