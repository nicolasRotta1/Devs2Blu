package Ex2;

public abstract class Investimento {
  private double valorInicial;
  private int meses;

  public Investimento(double valorInicial, int meses) {
    this.valorInicial = valorInicial;
    this.meses = meses;
  }

  public double getValorInicial() {
    return valorInicial;
  }

  public void setValorInicial(double valorInicial) {
    this.valorInicial = valorInicial;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public abstract double simular(double valorInicial, int meses);
  }

