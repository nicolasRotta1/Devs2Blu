package Ex1;

public class EntregaInternacional extends Entrega {

  public EntregaInternacional(double peso, double distancia) {
    super(peso, distancia);
  }

  @Override
  public Double calcularFrete() {
    double calculo = ((getPeso()*getCustoPeso()) + (getDistancia()*getCustoDistancia()) + getCustoBase()) * 1.20;
    return calculo;
  }
}
