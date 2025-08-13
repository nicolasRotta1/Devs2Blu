package Ex1;

public abstract class Entrega {
  private double peso;
  private double distancia;
  private double custoBase = 10;
  private double custoDistancia = 0.25;
  private double custoPeso = 0.5;

  public Entrega(double peso, double distancia) {
    this.peso = peso;
    this.distancia = distancia;
  }

  public abstract Double calcularFrete();

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getCustoBase() {
    return custoBase;
  }

  public void setCustoBase(double custoBase) {
    this.custoBase = custoBase;
  }

  public double getCustoDistancia() {
    return custoDistancia;
  }

  public void setCustoDistancia(double custoDistancia) {
    this.custoDistancia = custoDistancia;
  }

  public double getCustoPeso() {
    return custoPeso;
  }

  public void setCustoPeso(double custoPeso) {
    this.custoPeso = custoPeso;
  }
}
