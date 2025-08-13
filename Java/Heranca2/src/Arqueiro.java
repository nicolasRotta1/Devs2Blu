public class Arqueiro extends Personagem{
  private int flechas;

  public Arqueiro(String nome, int hp, int dano, int flechas) {
    super(nome, hp, dano);
    this.flechas = flechas;
  }

  @Override
  public void atacar() {
    System.out.println(getNome()+": Flechou");
  }

  public int getFlechas() {
    return flechas;
  }

  public void setFlechas(int flechas) {
    this.flechas = flechas;
  }
}
