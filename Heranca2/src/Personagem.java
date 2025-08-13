import java.util.Random;

public abstract class Personagem {
  private int id;
  private String nome;
  private int hp;
  private int dano;

  public Personagem(String nome, int hp, int dano) {
    this.id = new Random().nextInt(1000);
    this.nome = nome;
    this.hp = hp;
    this.dano = dano;
  }

  public abstract void atacar();

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getDano() {
    return dano;
  }

  public void setDano(int dano) {
    this.dano = dano;
  }
}
