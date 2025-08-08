package Exercicios.ex1;

public class Aviao extends Veiculo{
  private String companhia_aerea;

  public Aviao(String modelo, int ano, String companhia_aerea) {
    super(modelo, ano);
    this.companhia_aerea = companhia_aerea;
  }

  @Override
  public void detalhes() {
    System.out.println("Id: "+this.getId());
    System.out.println("Marca: "+this.getMarca());
    System.out.println("Ano: "+this.getAno());
    System.out.println("Companhia aérea : "+this.getCompanhia_aerea());
  }

  public String getCompanhia_aerea() {
    return companhia_aerea;
  }

  public void setCompanhia_aerea(String companhia_aerea) {
    this.companhia_aerea = companhia_aerea;
  }
}
