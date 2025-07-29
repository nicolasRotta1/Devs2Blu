package Models;

public class Marca {
  private int id;
  private String nome;
  private String paisDeOrigem;
  private String site;
  public static int contadorId;

  public Marca(String nome, String paisDeOrigem, String site) {
    contadorId++;
    this.id = contadorId;
    this.nome = nome;
    this.paisDeOrigem = paisDeOrigem;
    this.site = site;
  }

  public Marca() {
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPaisDeOrigem() {
    return paisDeOrigem;
  }

  public void setPaisDeOrigem(String paisDeOrigem) {
    this.paisDeOrigem = paisDeOrigem;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  @Override
  public String toString() {
    return "Marca:" +
            "\nID: " + id +
            "\nNome: " + nome +
            "\nPaís de Origem: " + paisDeOrigem +
            "\nSite: " + site;
  }
}