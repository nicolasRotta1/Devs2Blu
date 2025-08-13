package Ex1;

public class EntregaExpressa extends Entrega{
  public EntregaExpressa(double peso, double distancia) {
    super(peso, distancia);
  }

  @Override
  public Double calcularFrete() {
    double calculo = ((getPeso()*getCustoPeso()) + (getDistancia()*getCustoDistancia()) + getCustoBase()) * 1.15;
    return calculo;
  }


}
