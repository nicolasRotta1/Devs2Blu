package Exemplo2;

import java.util.Random;

public abstract class Planta {
  private int id;
  private String nome;
  private int idade;
  private String nome_cientifico;
  private String especie;
  private double altura;
  private Cuidados cuidados;


  public Planta(String nome, int idade, String nome_cientifico, String especie, double altura, Cuidados cuidados) {
    this.id = new Random().nextInt(1000);
    this.nome = nome;
    this.idade = idade;
    this.nome_cientifico = nome_cientifico;
    this.especie = especie;
    this.altura = altura;
    this.cuidados = cuidados;
  }

  public abstract void mostrar();

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNome_cientifico() {
    return nome_cientifico;
  }

  public void setNome_cientifico(String nome_cientifico) {
    this.nome_cientifico = nome_cientifico;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public Cuidados getCuidados() {
    return cuidados;
  }

  public void setCuidados(Cuidados cuidados) {
    this.cuidados = cuidados;
  }
}
