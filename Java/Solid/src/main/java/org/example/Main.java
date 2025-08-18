package org.example;

import org.example.D.ClienteServiceAltoNivel;
import org.example.D.MongoRepositorio;
import org.example.D.MysqlRepositorio;
import org.example.D.RepositorioBaixoNivel;
import org.example.O.CalculadoraDeDesconto;
import org.example.O.DescontoBlackFriday;
import org.example.O.DescontoNatal;
import org.example.O.DescontoVip;
import org.example.S.EmailService;
import org.example.S.Pedido;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        CalculadoraDeDesconto cal =  new CalculadoraDeDesconto();
//
//        double vip = cal.calcular(new DescontoVip(), 100);
//        double black = cal.calcular(new DescontoBlackFriday(), 200);
//        double natal = cal.calcular(new DescontoNatal(), 200);

        //Exemplo D
        RepositorioBaixoNivel mysqol =  new MysqlRepositorio();
        ClienteServiceAltoNivel service =  new ClienteServiceAltoNivel(mysqol);
        service.salvarCliente("Leidiane");

        RepositorioBaixoNivel mongo =  new MongoRepositorio();
        ClienteServiceAltoNivel service2 = new ClienteServiceAltoNivel(mongo);
        service2.salvarCliente("Jucemar");

    }
}