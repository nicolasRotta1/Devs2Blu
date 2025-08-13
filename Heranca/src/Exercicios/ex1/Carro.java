package Exercicios.ex1;

public class Carro extends Veiculo{
  private String modelo;

  public Carro(String modelo, int ano, String modelo1) {
    super(modelo, ano);
    this.modelo = modelo1;
  }

  @Override
  public void detalhes() {
    System.out.println("Id: "+this.getId());
    System.out.println("Marca: "+this.getMarca());
    System.out.println("Ano: "+this.getAno());
    System.out.println("Modelo: "+this.getModelo());
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
}
