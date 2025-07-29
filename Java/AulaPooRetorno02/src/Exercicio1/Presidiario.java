package Exercicio1;

import java.util.Random;

public class Presidiario {
    private int id;
    private String nome;
    private String crime;
    private String data_preso;
    private String data_de_soltura;

    public Presidiario(String nome, String crime, String data_preso) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.crime = crime;
        this.data_preso = data_preso;
    }
    public Presidiario(String nome, String crime, String data_preso, String data_de_soltura) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.crime = crime;
        this.data_preso = data_preso;
        this.data_de_soltura = data_de_soltura;
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

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getData_preso() {
        return data_preso;
    }

    public void setData_preso(String data_preso) {
        this.data_preso = data_preso;
    }

    public String getData_de_soltura() {
        return data_de_soltura;
    }

    public void setData_de_soltura(String data_de_soltura) {
        this.data_de_soltura = data_de_soltura;
    }
}
