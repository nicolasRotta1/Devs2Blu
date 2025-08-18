package org.example.O;

public class DescontoNatal implements Desconto{
    @Override
    public double aplicar(double valor) {
        return valor * 0.7;
    }
}
