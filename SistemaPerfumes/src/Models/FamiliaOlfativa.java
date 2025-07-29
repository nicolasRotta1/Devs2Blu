package Models;

public class FamiliaOlfativa {
  private int id;
  private String nome;
  private String descricao;
  private static int ContadorId;

  public FamiliaOlfativa(String nome) {
    ContadorId++;
    this.id = ContadorId;
    this.nome = nome;
  }

  public FamiliaOlfativa(String nome, String descricao) {
    ContadorId++;
    this.id = ContadorId;
    this.nome = nome;
    this.descricao= descricao;
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

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
