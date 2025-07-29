package ListaExercicios.Computador_Processador.Controller;

import ListaExercicios.Computador_Processador.Models.Computador;

public class ComputadorController {
    public void Ligar(Computador computador){
        System.out.println("Ligando o computador de número "+computador.getNome());
    }
}
