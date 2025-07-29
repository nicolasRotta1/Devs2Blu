package ListaExercicios.Carro_Proprietario.Models;

public class Carro {
    private int id;
    private String modelo;
    private Motor motor;
    private int ano;
    private Proprietario proprietario;
    private static int ContadorId;

    public Carro(String modelo, Motor motor, int ano) {
        ContadorId++;
        this.id = ContadorId;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
    }

    public Carro(String modelo, Motor motor, int ano, Proprietario proprietario) {
        ContadorId++;
        this.id = ContadorId;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
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

    public int getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }


}
