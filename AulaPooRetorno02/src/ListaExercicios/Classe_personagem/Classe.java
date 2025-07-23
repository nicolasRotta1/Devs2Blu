package ListaExercicios.Classe_personagem;

import java.util.List;
import java.util.Random;

public class Classe {
    private int id;
    private String nome;
    private List<Habilidade> habilidades;

    public Classe(String nome, List<Habilidade> habilidades) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.habilidades = habilidades;
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

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}
