package Exemplo2;

public class Flores extends Planta{
    private String cor;
    private static int contadorId;

  public Flores(String nome, int idade, String nome_cientifico, String especie, double altura, Cuidados cuidados, String cor) {
    super(nome, idade, nome_cientifico, especie, altura, cuidados);
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public void mostrar() {

  }
}
