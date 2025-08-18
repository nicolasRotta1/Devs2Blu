package org.example.O;

public class CalculadoraDeDesconto {

//Nivel baixo de OCP
//    public double aplicarDescontoVip(double valor){
//        return valor * 0.4;
//    }
//    public double aplicarDescontoBlacFriday(double valor){
//        return valor * 1.2;
//    }
//    public double aplicarDescontoNatal(double valor){
//        return valor * 0.9;
//    }


    public double calcular(Desconto desconto, double valor){
        return desconto.aplicar(valor);
    }



}
