package ListaExercicios.Carro_Proprietario.Models;


public class Motor {
    private int id;
    private String modelo;
    private String tipoCombustivel;
    private int potencia;
    private static int ContadorId;

    public Motor(String modelo, String tipoCombustivel, int potencia) {
        ContadorId++;
        this.id = ContadorId;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
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

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
