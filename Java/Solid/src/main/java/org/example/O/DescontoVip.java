package org.example.O;

public class DescontoVip implements Desconto{

    @Override
    public double aplicar(double valor) {
        return valor * 0.4;
    }
}
