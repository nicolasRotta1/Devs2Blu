package Ex2;

public class TesouroDireto extends Investimento{
  private double juros = 1.014;

  public TesouroDireto(double valorInicial, int meses) {
    super(valorInicial, meses);
  }

  public double getJuros() {
    return juros;
  }

  public void setJuros(double juros) {
    this.juros = juros;
  }

  @Override
  public void simular(double valorInicial, int meses) {
    for (int i = 0; i < meses; i++) {
      double valorFinal =+ valorInicial*juros;
    }
  }
}
