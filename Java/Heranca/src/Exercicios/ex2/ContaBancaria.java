package Exercicios.ex2;

import java.util.Random;
import java.util.Scanner;

public abstract class ContaBancaria {
  private int id;
  private String titular;
  private double saldo;

  public ContaBancaria(String titular, double saldo) {
    this.id = new Random().nextInt(1000);
    this.titular = titular;
    this.saldo = saldo;
  }

  public void depositar(double deposito) {
    setSaldo(this.getSaldo()+ deposito);
  }

  public abstract void sacar(double sacar);

  public void consulta_saldo(){
    System.out.println("Saldo: "+ this.getSaldo());
  };

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
