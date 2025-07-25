package ListaExercicios.Carro_Proprietario.Controller;

import ListaExercicios.Carro_Proprietario.Models.Motor;

public class MotorController {
    public void exibirDados(Motor motor){
        System.out.println("Motor "+motor.getId());
        System.out.println();
        System.out.println("Modelo: "+motor.getModelo());
        System.out.println("Tipo do Combustivel: "+motor.getTipoCombustivel());
        System.out.println("Potencia: "+motor.getPotencia());
    }
}
