package ListaExercicios.Carro_Proprietario;

import java.util.Random;

public class Motor {
    private int id;
    private String modelo;;
    private int potencia;

    public Motor(String modelo, int potencia) {
        this.id = new Random().nextInt(1000);
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
