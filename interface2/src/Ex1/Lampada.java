package Ex1;

public class Lampada implements Ligavel, Configuravel {

  @Override
  public void configurar(String parametro) {

  }

  @Override
  public void Ligar() {
    System.out.println("Ligando Lampada");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando hidroavião");
  }
}
