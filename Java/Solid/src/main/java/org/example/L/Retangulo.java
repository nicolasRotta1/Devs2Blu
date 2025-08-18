package org.example.L;

public class Retangulo  extends Forma{
    public int altura;
    public int largura;

    @Override
    public int calcularArea(){
        return altura * largura;

    }
}
