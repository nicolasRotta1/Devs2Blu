import java.util.Random;

public class Bola {
    int numeroDeSerie;
    String material;
    double raio;
    String cor;

    public Bola(){
        this.material = "Poliesteno";
        this.numeroDeSerie = new Random().nextInt(1000, 10000);
    }

    public void mostrarDados(){
        System.out.println("Número de série: "+this.numeroDeSerie);
        System.out.println("Cor : "+this.cor);
        System.out.println("Raio : "+this.raio);
        System.out.println("Máterial : "+this.material);
    }
}
