package ListaExercicios.Computador_Processador.Controller;

import ListaExercicios.Computador_Processador.Models.Processador;

public class ProcessadorController {
    public void exibirDados(Processador processador){
        System.out.println("Id: "+processador.getId());
        System.out.println("Modelo: "+processador.getModelo());
        System.out.println("Quantidade de nucleos: "+processador.getQtdNucleos());
        System.out.println("Marca: "+processador.getMarca());
    }
}
