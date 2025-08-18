package org.example.O;

public class DescontoBlackFriday implements Desconto{
    @Override
    public double aplicar(double valor) {
        return valor * 0.3;
    }
}
