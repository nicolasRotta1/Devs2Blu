package ListaExercicios.Carro_Proprietario.Controller;

import ListaExercicios.Carro_Proprietario.Models.Carro;

public class CarroController {
    public void Acelerar(Carro carro){
        System.out.println(carro.getModelo()+" esta acelerando");
    }
}
