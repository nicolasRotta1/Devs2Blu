package Ex2;

public class Poupanca extends Investimento {
  private double juros = 1.01;

  public Poupanca(double valorInicial, int meses) {
    super(valorInicial, meses);
  }

  public double getJuros() {
    return juros;
  }

  public void setJuros(double juros) {
    this.juros = juros;
  }

  @Override
  public double simular(double valorInicial, int meses) {
    double valorFinal;
    for (int i = 0; i < meses; i++) {
      valorFinal =+ valorInicial*juros;
    }
    return valorFinal;
  }
}
