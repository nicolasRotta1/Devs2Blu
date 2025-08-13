public class Guerreiro extends Personagem{

  public Guerreiro(String nome, int hp, int dano) {
    super(nome, hp, dano);
  }

  @Override
  public void atacar() {
    System.out.println(getNome()+": chablau tomele soco");
  }

  public void usarEscudo(){
    System.out.println(getNome()+": se defendeu");
  }


}
