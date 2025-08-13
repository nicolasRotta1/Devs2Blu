package Ex1;

public class Smarthphone implements Ligavel, Conectavel, Configuravel {


  @Override
  public void conectar() {
    System.out.println("Conectando ao smarthphone");
  }

  @Override
  public void configurar(String parametro) {

  }

  @Override
  public void Ligar() {
    System.out.println("Ligando Smarthphone");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando Smarthphone");

  }
}
