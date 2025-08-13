package Ex1;

public class EntregaNormal extends Entrega {


  public EntregaNormal(double peso, double distancia) {
    super(peso, distancia);
  }

  @Override
  public Double calcularFrete() {
    double calculo = ((getPeso()*getCustoPeso()) + (getDistancia()*getCustoDistancia()) + getCustoBase());
    return calculo;
  }
}
