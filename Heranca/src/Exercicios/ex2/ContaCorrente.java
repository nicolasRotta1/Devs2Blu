package Exercicios.ex2;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
  Scanner scan = new Scanner(System.in);
  private double limite_cheque;

  public ContaCorrente(String titular, double saldo, double limite_cheque) {
    super(titular, saldo);
    this.limite_cheque = limite_cheque;
  }

  @Override
  public void sacar(double saque) {
    double limite = super.getSaldo() + limite_cheque;
    if (limite > saque){
      limite -= saque;
      setSaldo(limite);
    }else {
      System.out.println("Cheque insuficiente");
    }

  }

  public double getLimite_cheque() {
    return limite_cheque;
  }

  public void setLimite_cheque(double limite_cheque) {
    this.limite_cheque = limite_cheque;
  }
}
