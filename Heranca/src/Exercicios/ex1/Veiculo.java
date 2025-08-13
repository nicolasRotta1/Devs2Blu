package Exercicios.ex1;

import java.util.Random;

public abstract class Veiculo {
  private int id;
  private String marca;
  private int ano;

  public Veiculo(String marca, int ano) {
    this.id = new Random().nextInt(1000);
    this.marca = marca;
    this.ano = ano;
  }

  public abstract void detalhes();

  public int getId() {
    return id;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}
