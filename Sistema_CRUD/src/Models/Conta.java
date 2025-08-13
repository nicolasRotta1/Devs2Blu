package Models;

import java.util.Scanner;

public abstract class Conta {
  private int id;
  private String nome;
  private double saldo;
  private static int ContadorId;
  Scanner sc = new Scanner(System.in);

  public Conta(String nome) {
    ContadorId++;
    this.id = ContadorId;
    this.nome = nome;
    this.saldo = 0;
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

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
