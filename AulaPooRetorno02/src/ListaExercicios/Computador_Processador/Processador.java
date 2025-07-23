package ListaExercicios.Computador_Processador;

public class Processador {
    private int id;
    private String modelo;
    private int qtdNucleos;
    private Marca marca;

    public Processador(int id, String modelo, int qtdNucleos, Marca marca) {
        this.id = id;
        this.modelo = modelo;
        this.qtdNucleos = qtdNucleos;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdNucleos() {
        return qtdNucleos;
    }

    public void setQtdNucleos(int qtdNucleos) {
        this.qtdNucleos = qtdNucleos;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
