package Ex2;

public class Acao extends Investimento{
  private double dividendos = 1.02;


  public Acao(double valorInicial, int meses) {
    super(valorInicial, meses);
  }

  public double getDividendos() {
    return dividendos;
  }

  public void setDividendos(double dividendos) {
    this.dividendos = dividendos;
  }

  @Override
  public void simular(double valorInicial, int meses) {
    for (int i = 0; i < meses; i++) {
      double valorFinal =+ valorInicial * dividendos;
    }
  }
}
