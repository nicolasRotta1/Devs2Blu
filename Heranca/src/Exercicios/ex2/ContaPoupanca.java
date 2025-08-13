package Exercicios.ex2;

public class ContaPoupanca extends ContaBancaria{
  private double taxa_juros;

  public ContaPoupanca(String titular, double saldo, double taxa_juros) {
    super( titular, saldo);
    this.taxa_juros = taxa_juros;
  }

  @Override
  public void sacar(double saque) {
    if (saque < getSaldo()){
      setSaldo(getSaldo() - saque);
    }
  }

  public void aplicarJuros(double taxa_juros){
    double saldo = getSaldo() * ((taxa_juros/100)+1);
    setSaldo(saldo);
  }


  public double getTaxa_juros() {
    return taxa_juros;
  }

  public void setTaxa_juros(double taxa_juros) {
    this.taxa_juros = taxa_juros;
  }
}
