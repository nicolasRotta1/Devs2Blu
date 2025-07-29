import ListaExercicios.Carro_Proprietario.Carro;
import ListaExercicios.Carro_Proprietario.Motor;
import ListaExercicios.Carro_Proprietario.Proprietario;
import ListaExercicios.Classe_personagem.Classe;
import ListaExercicios.Classe_personagem.Habilidade;
import ListaExercicios.Classe_personagem.Personagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Proprietario proprietario1 = new Proprietario("Jilberto", "22312323");
        Motor motor1 = new Motor("V8", 400);
        Carro carro1 = new Carro("Voyage", motor1, "Azules", proprietario1);
        carro1.mostrarDados();

        ArrayList<Habilidade> habilidades = new ArrayList<>();
        Habilidade bola_de_fogo = new Habilidade("Bola de fogo", "Causa burning por 5 segundos", 7, 30);
        habilidades.add(bola_de_fogo);

        Classe mago = new Classe("Mago", habilidades);

        Personagem personagem = new Personagem("Cleber", mago, 20);

        personagem.usarHabilidade(sc);


    }
}