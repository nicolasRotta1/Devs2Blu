package ListaExercicios.Carro_Proprietario;

import java.util.Random;

public class Carro {
    private int id;
    private String modelo;
    private Motor motor;
    private String cor;
    private Proprietario proprietario;

    public Carro(String modelo, Motor motor, String cor, Proprietario proprietario) {
        this.id = new Random().nextInt(1000);
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.proprietario = proprietario;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void cadastrarCarro(){
        System.out.println();
    }

    public void mostrarDados(){
        System.out.println(getId());
        System.out.println(getModelo());
        System.out.println(getMotor().getModelo());
        System.out.println(getCor());
        System.out.println(getProprietario().getNome());
    }
}
