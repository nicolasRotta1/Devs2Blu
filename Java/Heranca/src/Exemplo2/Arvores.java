package Exemplo2;

public class Arvores extends Planta {
  private String tipo_madeira;
  private static int contadorId;

  public Arvores(String nome, int idade, String nome_cientifico, String especie, double altura, Cuidados cuidados, String tipo_madeira) {
    super(nome, idade, nome_cientifico, especie, altura, cuidados);
    this.tipo_madeira = tipo_madeira;
  }

  @Override
  public void mostrar() {

  }
}
