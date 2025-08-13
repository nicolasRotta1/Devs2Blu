public class Mago extends Personagem{
  private int mana;

  public Mago(String nome, int hp, int dano, int mana) {
    super(nome, hp, dano);
    this.mana = mana;
  }

  @Override
  public void atacar() {
    System.out.println(getNome()+": ]BOWWW bola de fogo");
  }

  public void curar(){
    System.out.println(getNome()+": Curou");
  }

  public int getMana() {
    return mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }
}
