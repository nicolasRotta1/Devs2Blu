package ListaExercicios.Classe_personagem.Models;

import java.util.Random;

public class Habilidade {
    private int id;
    private String nome;
    private String efeito;
    private int tempo_recarga;
    private int dano;

    public Habilidade(String nome, String efeito, int tempo_recarga, int dano) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.efeito = efeito;
        this.tempo_recarga = tempo_recarga;
        this.dano = dano;
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

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public int getTempo_recarga() {
        return tempo_recarga;
    }

    public void setTempo_recarga(int tempo_recarga) {
        this.tempo_recarga = tempo_recarga;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
