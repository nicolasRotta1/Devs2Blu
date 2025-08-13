import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Personagem> personagems = new ArrayList<>();
    personagems.add(new Mago("roberto", 100, 15, 50));
    personagems.add(new Guerreiro("Cleber", 250, 25));
    personagems.add(new Arqueiro("Jeribaldo", 125, 15, 30));

    for (var personagem : personagems){
      personagem.atacar();
    }
  }
}